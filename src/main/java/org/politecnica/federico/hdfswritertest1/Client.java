package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.backtype.hadoop.pail.*;

public class Client {
	public static void main(String[] args) {
		try {

			TTransport transport;
			transport = new TSocket("localhost", 9090);
			transport.open();

			TProtocol protocol = new TBinaryProtocol(transport);
			// AttackService.Client client = new AttackService.Client(protocol);

			System.out.println("Working Directory = " + System.getProperty("user.dir"));

			String datapath = "global_terrorism.csv";
			Reader reader = Files.newBufferedReader(Paths.get(datapath), Charset.forName("ISO-8859-1"));
			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
			final int limit = 100;
			int counter = 0;
			for (CSVRecord record : csvParser) {
				loadAttackEvent(record, protocol);
				counter++;
				System.out.println("" + counter + "/" + limit);
				if (counter == limit)
					break;
			}

			csvParser.close();
			transport.close();

		} catch (TException x) {
			x.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadAttackEvent(CSVRecord record, TProtocol protocol) throws TException, IOException {

		/*SplitDataPailStructure reg = new SplitDataPailStructure();
		Pail<Data> dataPail, updatePail;
		if (i == 0) {
			dataPail = Pail.create("/tmp/data", reg);
			updatePail = Pail.create("/tmp/updates", reg);
			i++;
		} else {
			dataPail = new Pail<Data>("/tmp/data");
			updatePail = new Pail<Data>("/tmp/updates");
		}

		// TypedRecordOutputStream os = pail.openWrite();
		TypedRecordOutputStream outputStream = updatePail.openWrite();
		Pedigree p = new Pedigree();
		p.setTimestamp(System.currentTimeMillis());*/
		// Attack
		TMultiplexedProtocol multiplexedAttackProtocol = new TMultiplexedProtocol(protocol,"attack");
		AttackService.Client attackClient = new AttackService.Client(multiplexedAttackProtocol);

		long attackId = Long.parseLong(record.get("eventid"));

		final String descriptionColumnName = "weaptype1_txt";
		
		String descripcion = record.get(descriptionColumnName);
		
		
		/*Data dato = reg.createThriftObject();
		Data dato2 = reg.createThriftObject();
		Data dato3 = reg.createThriftObject();
		Data dato4 = reg.createThriftObject();
		Data dato5 = reg.createThriftObject();
		dato.setPedigree(p);
		dato2.setPedigree(p);
		dato3.setPedigree(p);
		dato4.setPedigree(p);
		dato5.setPedigree(p);*/

		/*Attack attack = new Attack();
		attack.setAttackId(attackId);

		AttackProperty atkProp = new AttackProperty();
		atkProp.setAttackId(attack);
		AttackPropertyValue atkPropVal = new AttackPropertyValue();

		DataUnit du = new DataUnit();*/

		final String longitudeColumnName = "longitude";
		if (record.isSet(longitudeColumnName) && !record.get(longitudeColumnName).isEmpty()) {
			// atkPropVal.setLongitude(Double.parseDouble(record.get(longitudeColumnName)));
			// atkProp.setProperty(atkPropVal);
			// du.setAttackProperty(atkProp);

			//dato.setDataUnit(du);
			//reg.serialize(dato);
			//outputStream.writeObject(dato);

			attackClient.setAttackLongitude(attackId, Double.parseDouble(record.get(longitudeColumnName)), descripcion);
		}

		final String latitudeColumnName = "latitude";
		if (record.isSet(latitudeColumnName) && !record.get(latitudeColumnName).isEmpty()) {
			/*atkPropVal.setLatitude(Double.parseDouble(record.get(latitudeColumnName)));
			atkProp.setProperty(atkPropVal);
			du.setAttackProperty(atkProp);

			dato.setDataUnit(du);

			outputStream.writeObject(dato);*/
			attackClient.setAttackLatitude(attackId, Double.parseDouble(record.get(latitudeColumnName)), descripcion);
		}


		final String summaryColumnName = "summary";
		if (record.isSet(summaryColumnName) && !record.get(summaryColumnName).isEmpty()) {
			/*atkPropVal.setSummary(record.get(summaryColumnName));
			atkProp.setProperty(atkPropVal);
			du.setAttackProperty(atkProp);

			dato.setDataUnit(du);

			outputStream.writeObject(dato);*/
			attackClient.setAttackSummary(attackId, record.get(summaryColumnName), descripcion);
		}

		

		final String numberOfKillsColumnName = "nkill";
		if (record.isSet(numberOfKillsColumnName) && !record.get(numberOfKillsColumnName).isEmpty()) {
			/*atkPropVal.setNkills(Long.parseLong(record.get(numberOfKillsColumnName)));
			atkProp.setProperty(atkPropVal);
			du.setAttackProperty(atkProp);

			dato.setDataUnit(du);

			outputStream.writeObject(dato);*/
			attackClient.setAttackNumberOfKills(attackId, Long.parseLong(record.get(numberOfKillsColumnName)), descripcion);
		} 

		// Weapon
		TMultiplexedProtocol multiplexedWeaponProtocol = new TMultiplexedProtocol(protocol, "weapon");
		WeaponService.Client weaponClient = new WeaponService.Client(multiplexedWeaponProtocol);

		/*Weapon wpnId = new Weapon();
		WeaponProperty wprop = new WeaponProperty();
		WeaponPropertyValue wpval = new WeaponPropertyValue();

		
		wpnId.setWeaponId(weaponId);

		wprop.setWeaponId(wpnId);

		DataUnit du2 = new DataUnit();
		// weaponClient.addWeapon(weaponId);*/
		
		long weaponId = Long.parseLong(record.get("weaptype1"));
		//final String descriptionColumnName = "weaptype1_txt";
		if (record.isSet(descriptionColumnName) && !record.get(descriptionColumnName).isEmpty())
			//wpval.setDescription(record.get(descriptionColumnName));
			weaponClient.setWeaponDescription(weaponId,	record.get(descriptionColumnName));

		/*wprop.setProperty(wpval);
		du2.setWeaponProperty(wprop);

		dato2.setDataUnit(du2);
		reg.serialize(dato2);*/
		
		// Location
		TMultiplexedProtocol multiplexedLocationProtocol = new TMultiplexedProtocol(protocol, "location");
		LocationService.Client locationClient = new LocationService.Client(multiplexedLocationProtocol);

		/*Location locId = new Location();
		LocationProperty lProp = new LocationProperty();
		LocationPropertyValue lPropVal = new LocationPropertyValue();


		locId.setLocationId(locationId);

		lProp.setLocationId(locId);

		DataUnit du3 = new DataUnit();*/
		// locationClient.addLocation(locationId);

		long locationId = Long.parseLong(record.get("country")) * 100 + Long.parseLong(record.get("region"));
		
		final String countryColumnName = "country_txt";
		if (record.isSet(countryColumnName) && !record.get(countryColumnName).isEmpty())
			locationClient.setLocationCountry(locationId, record.get(countryColumnName), descripcion);

		//lPropVal.setCountry(record.get(countryColumnName));
		final String regionColumnName = "region_txt";
		if (record.isSet(regionColumnName) && !record.get(regionColumnName).isEmpty())
			locationClient.setLocationRegion(locationId, record.get(regionColumnName), descripcion);
		
		//lPropVal.setRegion(record.get(regionColumnName));

		final String cityColumnName = "city";
		if (record.isSet(cityColumnName) && !record.get(cityColumnName).isEmpty())
			locationClient.setLocationCity(locationId, record.get(cityColumnName), descripcion);
		
		//lPropVal.setCity(record.get(cityColumnName));

		/*lProp.setProperty(lPropVal);
		du3.setLocationProperty(lProp);

		dato3.setDataUnit(du3);
		reg.serialize(dato3);*/
		
		// Relationships
		/*DataUnit du4 = new DataUnit();
		DataUnit du5 = new DataUnit();

		HappendsEdge he = new HappendsEdge();
		he.setAttackId(attackId);
		he.setLocationId(locationId);
		du4.setHappedsEdge(he);

		dato4.setDataUnit(du4);
		reg.serialize(dato4);

		UsesEdge ue = new UsesEdge();
		ue.setAttackId(attackId);
		ue.setWeaponId(weaponId);
		du5.setUsesEdge(ue);

		dato5.setDataUnit(du5);
		reg.serialize(dato5);

		outputStream.writeObject(dato2);
		outputStream.writeObject(dato3);
		outputStream.writeObject(dato4);
		outputStream.writeObject(dato5);
		outputStream.close();

		dataPail.absorb(updatePail);*/
		
		TMultiplexedProtocol multiplexedHappendsEdgeProtocol = new TMultiplexedProtocol(protocol, "happendsEdge");
		HappendsEdgeService.Client happendsEdgeClient = new HappendsEdgeService.Client(multiplexedHappendsEdgeProtocol);
		
		happendsEdgeClient.setAttackLocation(attackId, locationId, descripcion);
		
		TMultiplexedProtocol multiplexedUsesEdgeProtocol = new TMultiplexedProtocol(protocol, "usesEdge");
		UsesEdgeService.Client usesEdgeClient = new UsesEdgeService.Client(multiplexedUsesEdgeProtocol);

		try {
			usesEdgeClient.setAttackWeapon(attackId, weaponId, descripcion);
		} catch (NullPointerException e) {
			System.out.println("Que carajos pasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
			

		// attackClient.setAttackLocation(attackId, locationId);
		// attackClient.setAttackWeapon(attackId, weaponId);
	}
}
