package org.politecnica.federico.hdfswritertest1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.thrift.TException;
import org.codehaus.jackson.map.ObjectMapper;

public class WeaponServiceHandler implements WeaponService.Iface{
	
	public final static String weaponDir = "weapons/";

	@Override
	public long addWeapon(long weaponId) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + weaponDir + "existence/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("weaponId", weaponId);
	    	fact.put("timestamp", System.currentTimeMillis());
	    	
	    	ObjectMapper mapper = new ObjectMapper();
	    	String jsonStr = mapper.writeValueAsString(fact);
	    	
	    	//System.out.println(jsonStr);
	    	
	    	writer.write(jsonStr);
	    	
	    	writer.close();
	    	
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return weaponId;
	}

	@Override
	public void setWeaponDescription(long weaponId, String description) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + weaponDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("weaponId", weaponId);
	    	fact.put("description", description);
	    	fact.put("timestamp", System.currentTimeMillis());
	    	
	    	ObjectMapper mapper = new ObjectMapper();
	    	String jsonStr = mapper.writeValueAsString(fact);
	    	
	    	//System.out.println(jsonStr);
	    	
	    	writer.write(jsonStr);
	    	
	    	writer.close();
	    	
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
