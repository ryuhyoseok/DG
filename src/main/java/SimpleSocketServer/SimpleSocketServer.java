package SimpleSocketServer;

import loc.PointGenerator;
import org.apache.commons.math3.distribution.UniformRealDistribution;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer implements Runnable {
    ServerSocket serverSocket;
    Socket socket;
    Thread thr;
    PubXMLGenerator xg;
	  SubXMLGenerator sg;
	
    int portNumber = 1777;
    
    public SimpleSocketServer() {
      
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
          Thread.sleep(60000);
          PointGenerator generator = new PointGenerator();
          generator.setBulkSize(1000);
          generator.setSleepTime(50);
          generator.setXDistribution(new UniformRealDistribution(0 , 100000));
          generator.setYDistribution(new UniformRealDistribution(0 , 100000));
          generator.setOutputStream(socket.getOutputStream());
	    		generator.run();
    		} catch(Exception e){e.printStackTrace();}
    		
    	}
    }
    
    public static void main(String[] args) {

    	SimpleSocketServer server = new  SimpleSocketServer();
      server.start();
    }
}