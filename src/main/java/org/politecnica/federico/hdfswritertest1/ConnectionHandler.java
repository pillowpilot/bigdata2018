package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

public class ConnectionHandler {
	final static String uri = "hdfs://localhost:9000/";
	
	static FileSystem getFileSystem() 
	{
    	Configuration configuration = new Configuration();
    	FileSystem fs = null;
		try {
			fs = FileSystem.get(new URI(uri), configuration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return fs;
	}
	static String getURI()
	{
		return uri;
	}
}
