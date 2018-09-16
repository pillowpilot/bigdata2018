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

public class AttackServiceHandler implements AttackService.Iface{

	public final static String attackDir = "attacks/";
	
	@Override
	public long addAttack(long attackId) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "existence/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
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

		return attackId;
	}

	@Override
	public void setAttackSummary(long attackId, String summary) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
	    	fact.put("summary", summary);
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

	@Override
	public void setAttackLatitude(long attackId, double latitude) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
	    	fact.put("latitude", latitude);
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

	@Override
	public void setAttackLongitude(long attackId, double longitude) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
	    	fact.put("longitude", longitude);
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

	@Override
	public void setAttackNumberOfKills(long attackId, long numberOfKills) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
	    	fact.put("nkills", numberOfKills);
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

	@Override
	public void setAttackLocation(long attackId, long locationId) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "relationships/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
	    	fact.put("locationId", locationId);
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

	@Override
	public void setAttackWeapon(long attackId, long weaponId) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + attackDir + "relationships/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("attackId", attackId);
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
	}

}
