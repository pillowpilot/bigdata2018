package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.thrift.TException;


public class AttackServiceHandler implements AttackService.Iface {

	@Override
	public void setAttackSummary(long attackId, java.lang.String summary, java.lang.String descripcion) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Attack atkId = new Attack();
		atkId.setAttackId(attackId);

		AttackProperty atkProp = new AttackProperty();
		atkProp.setAttackId(atkId);
		AttackPropertyValue atkPropVal = new AttackPropertyValue();

		DataUnit du = new DataUnit();
		atkPropVal.setSummary(summary);
		atkProp.setProperty(atkPropVal);
		du.setAttackProperty(atkProp);

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
	public void setAttackLatitude(long attackId, double latitude, java.lang.String descripcion) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Attack attack = new Attack();
		attack.setAttackId(attackId);

		AttackProperty atkProp = new AttackProperty();
		atkProp.setAttackId(attack);
		AttackPropertyValue atkPropVal = new AttackPropertyValue();

		DataUnit du = new DataUnit();
		atkPropVal.setLatitude(latitude);
		atkProp.setProperty(atkPropVal);
		du.setAttackProperty(atkProp);
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
	public void setAttackLongitude(long attackId, double longitude, java.lang.String descripcion) throws TException{

		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Attack attack = new Attack();
		attack.setAttackId(attackId);

		AttackProperty atkProp = new AttackProperty();
		atkProp.setAttackId(attack);
		AttackPropertyValue atkPropVal = new AttackPropertyValue();

		DataUnit du = new DataUnit();
		atkPropVal.setLongitude(longitude);
		atkProp.setProperty(atkPropVal);
		du.setAttackProperty(atkProp);

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
	public void setAttackNumberOfKills(long attackId, long numberOfKills, java.lang.String descripcion) throws TException {
		SplitDataPailStructure reg = new SplitDataPailStructure();
		Data dato = reg.createThriftObject();
		Attack attack = new Attack();
		attack.setAttackId(attackId);

		AttackProperty atkProp = new AttackProperty();
		atkProp.setAttackId(attack);
		AttackPropertyValue atkPropVal = new AttackPropertyValue();

		DataUnit du = new DataUnit();
		atkPropVal.setNkills(numberOfKills);
		atkProp.setProperty(atkPropVal);
		du.setAttackProperty(atkProp);

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
