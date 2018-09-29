package org.politecnica.federico.hdfswritertest1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.io.ByteArrayOutputStream;

import com.backtype.hadoop.pail.PailStructure;

public class DataPailStructure extends ThriftPailStructure<Data>{
	public Class getType() {
		return Data.class;
	}

	protected Data createThriftObject() {
		return new Data();
	}
	
	/*public byte[] serialize(Data data) {
		//ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		//DataOutputStream dataOut = new DataOutputStream(byteOut);
		
		//try {
			byte[] dataBytes = this.serialize(data);
			//dataOut.writeInt(dataBytes.length);
			//dataOut.write(dataBytes);
			//dataOut.writeLong(data.getPedigree().timestamp);
			//dataOut.close();
			return dataBytes;
		//} catch (IOException e) {
			//throw new RuntimeException(e);
		//}
		//return byteOut.toByteArray();
	}

	public Data deserialize(byte[] serialized) {
		DataInputStream dataIn = new DataInputStream(new ByteArrayInputStream(
				serialized));
		/*byte[] dataBytes = new byte[dataIn.readInt()];
		dataIn.read(dataBytes);
		return new Data(new String(userBytes), dataIn.readLong());
		return this.deserialize(serialized);
	}*/

	public List<String> getTarget(Data object) {
		List<String> ret = new ArrayList<String>();
		DataUnit du = object.getDataUnit();
		//if(!object.getDescripcion().isSet() || object.getDescripcion().getDescription().isEmpty())
			//ret.add("Unknown");
		//else
			ret.add(""+object.getDescripcion().getDescription());
		if(du.isSetAttackProperty())
			ret.add(""+"Attacks");
		else if (du.isSetLocationProperty())
			ret.add(""+"Location");
		else if(du.isSetWeaponProperty())
			ret.add(""+"Weapon");
		else if(du.isSetHappedsEdge())
			ret.add(""+"Happens");
		else
			ret.add(""+"Uses");
		//short id =du.getSetField().getThriftFieldId(); 
		//ret.add("" + id);
		//validFieldMap.get(id).fillTarget(ret, du.getFieldValue()); 
		return ret;
	}

	public boolean isValidTarget(String... dirs) {
		return true;
	}
}