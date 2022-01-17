
package npbernhardt;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NPBernhardt {
    public static void main(String[] args) throws UnknownHostException {
      
        InetAddress ip = InetAddress.getByName("localhost");
        System.out.println(ip);
        
    }
    
}
