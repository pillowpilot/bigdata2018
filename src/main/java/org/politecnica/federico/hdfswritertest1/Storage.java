package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;

import org.apache.hadoop.fs.FileSystem;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;

public class Storage {

	static int i =0;
	public static void writeData(Data dato) throws IOException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
       	SplitDataPailStructure reg = new SplitDataPailStructure();
    		Pail<Data> dataPail, updatePail;
    		TypedRecordOutputStream outputStream;
    		if (i == 0) {
    			dataPail = Pail.create(fs, "data/", reg);
    			updatePail = Pail.create(fs, "updates/", reg);
    			//outputStream = dataPail.openWrite();
    			i++;
    		} else {
    			dataPail = new Pail<Data>(fs, "data/");
    			updatePail = new Pail<Data>(fs, "updates/");
    			//outputStream = updatePail.openWrite();
    		}

    		// TypedRecordOutputStream os = pail.openWrite();
    		
    		/*Pedigree p = new Pedigree();
    		p.setTimestamp(System.currentTimeMillis());
    		dato.setPedigree(p);
    		
    		reg.serialize(dato);
    		outputStream.writeObject(dato);
    		if(i!=0) {
    			dataPail.absorb(updatePail);
    		}
    		i++;
    		outputStream.close();*/
    		outputStream = updatePail.openWrite();
    		Pedigree p = new Pedigree();
    		p.setTimestamp(System.currentTimeMillis());
    		dato.setPedigree(p);
    		reg.serialize(dato);
    		outputStream.writeObject(dato);
    		dataPail.absorb(updatePail);
    		outputStream.close();
	}
	
	public static void readData() throws IOException {
		FileSystem fs = ConnectionHandler.getFileSystem();
		if(fs == null)
			System.err.println("Connection to HDFS refused");
		Pail<Data> readPail = new Pail<Data>(fs, "data/");
		for (Data l : readPail)
			System.out.println(l.getDataUnit().getFieldValue() + " " + l.getPedigree().getTimestamp());

	}
}
