package SimpleSocketServer;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
 
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
    			
    			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
    			    			 
	    		while(true) {
	    		
	            String str;
	            oos.flush();
	            Random rand = new Random();
	            int i = rand.nextInt(2);
	            
	            if ( i == 0 ) { 
	            	xg = new PubXMLGenerator();
	            	xg.generate();
	            	str = xg.returnXML();
	            	
	            }
	            else {
	            	sg = new SubXMLGenerator();
	            	sg.generate();
	            	str = sg.returnXML();
	            	
	            }
	           
	            oos.writeObject(str);
	            System.out.println(str);
            	
	            Thread.sleep(1000);
	    		}
    		} catch(Exception e){e.printStackTrace();}
    		
    	}
    }
    
    public static void main(String[] args) {

    	SimpleSocketServer server = new  SimpleSocketServer();
        server.start();
    }
}