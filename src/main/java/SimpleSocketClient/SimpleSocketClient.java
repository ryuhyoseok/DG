package SimpleSocketClient;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import SimpleSocketServer.PubXMLGenerator;
import SimpleSocketServer.SimpleSocketServer;

public class SimpleSocketClient implements Runnable{
    Socket socket;
    Thread thr;
    
    ObjectInputStream ois;
    
    int portNumber = 1777;
    
    public SimpleSocketClient() {
        try {
        	socket = new Socket("127.0.0.1", portNumber);
            ois = new ObjectInputStream(socket.getInputStream());
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public void start() {
            thr = new Thread(this);
            thr.start();
    }
 
    @Override
    public void run() {
        while (true) {
            try {
            	String str;
            	str = (String)ois.readObject();
            	System.out.println(str);
            	
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
    public static void main(String[] args) {

    	SimpleSocketClient client = new  SimpleSocketClient();
        client.start();
    }
}



