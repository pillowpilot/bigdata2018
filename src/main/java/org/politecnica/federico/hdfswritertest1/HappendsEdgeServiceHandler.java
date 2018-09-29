package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.thrift.TException;

public class HappendsEdgeServiceHandler implements HappendsEdgeService.Iface{

	@Override
	public void setAttackLocation(long attackId, long locationId, java.lang.String descripcion) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		DataUnit du = new DataUnit();
		
		HappendsEdge he = new HappendsEdge();
		he.setAttackId(attackId);
		he.setLocationId(locationId);
		du.setHappedsEdge(he);
		
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
