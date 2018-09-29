package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.thrift.TException;

public class WeaponServiceHandler implements WeaponService.Iface{

	@Override
	public void setWeaponDescription(long weaponId, java.lang.String description) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Weapon wpnId = new Weapon();
		wpnId.setWeaponId(weaponId);
		
		WeaponProperty wprop = new WeaponProperty();
		WeaponPropertyValue wpval = new WeaponPropertyValue();
		wprop.setWeaponId(wpnId);
		
		wpval.setDescription(description);
		wprop.setProperty(wpval);
		
		DataUnit du = new DataUnit();
		du.setWeaponProperty(wprop);
		
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
