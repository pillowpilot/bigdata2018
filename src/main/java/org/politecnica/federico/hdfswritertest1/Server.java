package org.politecnica.federico.hdfswritertest1;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {

  public static AttackServiceHandler attackHandler;
  public static LocationServiceHandler locationHandler;
  public static WeaponServiceHandler weaponHandler;

  public static AttackService.Processor attackProcessor;
  public static LocationService.Processor locationProcessor;
  public static WeaponService.Processor weaponProcessor;

  public static void main(String [] args) {
    try {
	  attackHandler = new AttackServiceHandler();
	  locationHandler = new LocationServiceHandler();
	  weaponHandler = new WeaponServiceHandler();
	  
	  TMultiplexedProcessor multiplexedProcessor = new TMultiplexedProcessor();
	  
	  attackProcessor = new AttackService.Processor(attackHandler);
	  multiplexedProcessor.registerProcessor("attack", attackProcessor);
	  
      locationProcessor = new LocationService.Processor(locationHandler);
      multiplexedProcessor.registerProcessor("location", locationProcessor);
      
      weaponProcessor = new WeaponService.Processor(weaponHandler);
      multiplexedProcessor.registerProcessor("weapon", weaponProcessor);
      
      TServerTransport serverTransport = new TServerSocket(9090);
      TServer server = new TSimpleServer(new Args(serverTransport).processor(multiplexedProcessor));
      
      System.out.println("Starting the simple attack server at 9090...");
      server.serve();
      
    } catch (Exception x) {
      x.printStackTrace();
    }
  }
}