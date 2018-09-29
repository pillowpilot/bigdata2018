package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.thrift.TException;

public class UsesEdgeServiceHandler implements UsesEdgeService.Iface{

	@Override
	public void setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		DataUnit du = new DataUnit();
		
		UsesEdge ue = new UsesEdge();
		ue.setAttackId(attackId);
		ue.setWeaponId(weaponId);
		du.setUsesEdge(ue);
		
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
