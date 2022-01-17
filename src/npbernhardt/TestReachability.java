
package npbernhardt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestReachability {
     public static void main(String[] args) throws UnknownHostException, IOException {
        
         InetAddress ip = InetAddress.getByName("122.244.23.33");
         if(ip.isReachable(5000)){
             System.out.println("yes its reachable");
         }else{
             System.out.println("not reachable");
         }
         
    }
}
