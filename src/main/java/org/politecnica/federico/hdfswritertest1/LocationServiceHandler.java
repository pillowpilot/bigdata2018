package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.thrift.TException;

public class LocationServiceHandler implements LocationService.Iface{

	@Override
	public void setLocationCountry(long locationId, java.lang.String country, java.lang.String descripcion) throws TException{
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Location locId = new Location();
		LocationProperty lProp = new LocationProperty();
		LocationPropertyValue lPropVal = new LocationPropertyValue();

		locId.setLocationId(locationId);
		lProp.setLocationId(locId);
		
		DataUnit du = new DataUnit();
		lPropVal.setCountry(country);
		
		lProp.setProperty(lPropVal);
		du.setLocationProperty(lProp);
		
		WeaponPropertyValue wpval = new WeaponPropertyValue();
		wpval.setDescription(descripcion);
		dato.setDescripcion(wpval);
		dato.setDataUnit(du);
		try {
			Storage.writeData(dato);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
    public void setLocationRegion(long locationId, java.lang.String region, java.lang.String descripcion) throws TException{
    	SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Location locId = new Location();
		LocationProperty lProp = new LocationProperty();
		LocationPropertyValue lPropVal = new LocationPropertyValue();

		locId.setLocationId(locationId);
		lProp.setLocationId(locId);
		
		DataUnit du = new DataUnit();
		lPropVal.setRegion(region);
		lProp.setProperty(lPropVal);
		du.setLocationProperty(lProp);
		
		WeaponPropertyValue wpval = new WeaponPropertyValue();
		wpval.setDescription(descripcion);
		dato.setDescripcion(wpval);
		dato.setDataUnit(du);
		try {
			Storage.writeData(dato);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

	@Override
    public void setLocationCity(long locationId, java.lang.String city, java.lang.String descripcion) throws TException{
    	SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Location locId = new Location();
		LocationProperty lProp = new LocationProperty();
		LocationPropertyValue lPropVal = new LocationPropertyValue();

		locId.setLocationId(locationId);
		lProp.setLocationId(locId);
		
		DataUnit du = new DataUnit();
		lPropVal.setCity(city);
		
		lProp.setProperty(lPropVal);
		du.setLocationProperty(lProp);
		
		WeaponPropertyValue wpval = new WeaponPropertyValue();
		wpval.setDescription(descripcion);
		dato.setDescripcion(wpval);
		dato.setDataUnit(du);
		try {
			Storage.writeData(dato);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
