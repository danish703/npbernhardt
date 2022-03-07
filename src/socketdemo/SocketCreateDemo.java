
package socketdemo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class SocketCreateDemo {
    public static void main(String[] args) throws IOException {
        try{
            Socket sc = new Socket("time.nist.gov",13); 
            System.out.println(sc.isConnected());
            //sc.setSoTimeout(0);
            System.out.println(sc.getLocalAddress());
            System.out.println(sc.getRemoteSocketAddress());
            System.out.println(sc.getLocalPort());
            System.out.println(sc.getPort());
           // create the object of the socket and immediately connectin establish
             Socket sc2 = new Socket(); // 1. Create empty socket object
             
             System.out.println(sc2.isConnected());
           SocketAddress socketAddress = new InetSocketAddress("time.nist.gov",13); //2. Create the Socket address
           //sc2.setSoTimeout(5000);
           sc2.connect(socketAddress); // establish the connection
            System.out.println(sc2.isConnected());
            sc2.close();
            boolean connected = sc2.isConnected() && ! sc2.isClosed();
            System.out.println(connected);
            System.out.println(sc.toString());
        }catch(UnknownHostException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
