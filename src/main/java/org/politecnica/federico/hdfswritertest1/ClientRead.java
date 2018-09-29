package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientRead {
	public static void main(String[] args) {
		try {

			TTransport transport;
			transport = new TSocket("localhost", 9090);
			transport.open();

			//TProtocol protocol = new TBinaryProtocol(transport);
			// AttackService.Client client = new AttackService.Client(protocol);

			System.out.println("Working Directory = " + System.getProperty("user.dir"));

			Storage.readData();
			transport.close();

		} catch (TException x) {
			x.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
