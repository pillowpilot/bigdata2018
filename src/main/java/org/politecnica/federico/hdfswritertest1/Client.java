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
import org.apache.thrift.transport.TTransport;

import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;

public class Client {
  public static void main(String [] args) {
    try {
      TTransport transport;
      transport = new TSocket("localhost", 9090);
      transport.open();

      TProtocol protocol = new  TBinaryProtocol(transport);
      //AttackService.Client client = new AttackService.Client(protocol);
      
      System.out.println("Working Directory = " + System.getProperty("user.dir"));
      
      String datapath = "global_terrorism.csv";
      Reader reader = Files.newBufferedReader(Paths.get(datapath), Charset.forName("ISO-8859-1"));      
      CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
    		  .withFirstRecordAsHeader());
      
      final int limit = 100;
      int counter = 0;
      for(CSVRecord record: csvParser)
      {
    	  loadAttackEvent(record, protocol);
    	  counter++;
    	  System.out.println("" + counter + "/" + limit);
    	  if( counter == limit )
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
  
  private static void loadAttackEvent(CSVRecord record, TProtocol protocol) throws TException
  {
	  // Attack
	  TMultiplexedProtocol multiplexedAttackProtocol = new TMultiplexedProtocol(protocol, "attack");
	  AttackService.Client attackClient = new AttackService.Client(multiplexedAttackProtocol);
	  
	  Long attackId = Long.parseLong(record.get("eventid"));
	  attackClient.addAttack(attackId);
	  
	  final String longitudeColumnName = "longitude";
	  if(record.isSet(longitudeColumnName) && !record.get(longitudeColumnName).isEmpty())
		  attackClient.setAttackLongitude(attackId, Double.parseDouble(record.get(longitudeColumnName)));
	  
	  final String latitudeColumnName = "latitude";
	  if(record.isSet(latitudeColumnName)  && !record.get(latitudeColumnName).isEmpty())
		  attackClient.setAttackLatitude(attackId, Double.parseDouble(record.get(latitudeColumnName)));
	  
	  final String summaryColumnName = "summary";
	  if(record.isSet(summaryColumnName) && !record.get(summaryColumnName).isEmpty())
		  attackClient.setAttackSummary(attackId, record.get(summaryColumnName));
	  
	  final String numberOfKillsColumnName = "nkill";
	  if(record.isSet(numberOfKillsColumnName) && !record.get(numberOfKillsColumnName).isEmpty())
		  attackClient.setAttackNumberOfKills(attackId, Long.parseLong(record.get(numberOfKillsColumnName)));
	  
	  // Weapon
	  TMultiplexedProtocol multiplexedWeaponProtocol = new TMultiplexedProtocol(protocol, "weapon");
	  WeaponService.Client weaponClient = new WeaponService.Client(multiplexedWeaponProtocol);
	  
	  Long weaponId = Long.parseLong(record.get("weaptype1"));
	  weaponClient.addWeapon(weaponId);
	  
	  final String descriptionColumnName = "weaptype1_txt";
	  if(record.isSet(descriptionColumnName) && !record.get(descriptionColumnName).isEmpty())
		  weaponClient.setWeaponDescription(weaponId, record.get(descriptionColumnName));
	  
	  // Location
	  TMultiplexedProtocol multiplexedLocationProtocol = new TMultiplexedProtocol(protocol, "location");
	  LocationService.Client locationClient = new LocationService.Client(multiplexedLocationProtocol);
	  
	  Long locationId = Long.parseLong(record.get("country"))*100 + Long.parseLong(record.get("region"));
	  locationClient.addLocation(locationId);
	  
	  final String countryColumnName = "country_txt";
	  if(record.isSet(countryColumnName) && !record.get(countryColumnName).isEmpty())
		  locationClient.setLocationCountry(locationId, record.get(countryColumnName));
	  
	  final String regionColumnName = "region_txt";
	  if(record.isSet(regionColumnName) && !record.get(regionColumnName).isEmpty())
		  locationClient.setLocationRegion(locationId, record.get(regionColumnName));
	  
	  final String cityColumnName = "city";
	  if(record.isSet(cityColumnName) && !record.get(cityColumnName).isEmpty())
		  locationClient.setLocationCity(locationId, record.get(cityColumnName));
	  
	  // Relationships
	  attackClient.setAttackLocation(attackId, locationId);
	  attackClient.setAttackWeapon(attackId, weaponId);
	  
  }
}