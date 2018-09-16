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

public class LocationServiceHandler implements LocationService.Iface{
	
	public final static String locationDir = "locations/"; 

	@Override
	public long addLocation(long locationId) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + locationDir + "existence/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
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

		return locationId;
	}

	@Override
	public void setLocationCountry(long locationId, String country) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + locationDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("locationId", locationId);
	    	fact.put("country", country);
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
	public void setLocationRegion(long locationId, String region) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + locationDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("locationId", locationId);
	    	fact.put("region", region);
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
	public void setLocationCity(long locationId, String city) throws TException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		
		RandomString randomString = new RandomString();
		String newFileName = randomString.nextString();
		Path newFilePath = new Path(ConnectionHandler.getURI() + locationDir + "properties/" + newFileName);
		
		try {
			OutputStream os = fs.create(newFilePath);
			//System.out.println("Created file: " + newFilePath);
			
	    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	    	
	    	Map<String, Object> fact = new HashMap<>();
	    	fact.put("locationId", locationId);
	    	fact.put("city", city);
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
