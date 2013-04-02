package SimpleSocketServer;

import loc.RangeGenerator;
import org.apache.commons.math3.distribution.UniformRealDistribution;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketSubServer implements Runnable {
    ServerSocket serverSocket;
    Socket socket;
    Thread thr;
    PubXMLGenerator xg;
	  SubXMLGenerator sg;

    int portNumber = 2777;

    public SimpleSocketSubServer() {
      
    }
 
    public void start() {
            thr = new Thread(this);
            thr.start();
    }
 
    @Override
    public void run() {
    	  try {
          	serverSocket = new ServerSocket(portNumber);
          	
          	 while (true) {
                 try {
                	socket = serverSocket.accept();
                	System.out.println("Connenction is started with " + socket.getInetAddress().getHostAddress());
                	NetworkThread networkThread = new NetworkThread(socket);
                	networkThread.start();
                    
                 } catch (IOException e) {
                     e.printStackTrace();
                     break;
                 } 
             }
          	 
                    
          } catch (IOException e) {
              e.printStackTrace();
          }
    	  
       
    }
    
    class NetworkThread extends Thread {
    	private Socket socket;
    			
    	public NetworkThread (Socket socket) {
    		this.socket = socket;
    	}
    	
    	@Override
    	public void run(){
    		try {
          RangeGenerator generator = new RangeGenerator();
          generator.setBulk(500);
          generator.setSleepTime(5);
          generator.setXDistributions(new UniformRealDistribution(0 , 100000) , new UniformRealDistribution(1000 , 10000));
          generator.setYDistributions(new UniformRealDistribution(0 , 100000) , new UniformRealDistribution(1000 , 10000));
          generator.setOutputStream(socket.getOutputStream());
//          generator.setRangeNum(1);
	    		generator.run();
    		} catch(Exception e){e.printStackTrace();}
    		
    	}
    }
    
    public static void main(String[] args) {

    	SimpleSocketSubServer server = new SimpleSocketSubServer();
      server.start();
    }
}