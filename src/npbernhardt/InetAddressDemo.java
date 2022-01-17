
package npbernhardt;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        
//        InetAddress ip = InetAddress.getByName("157.240.16.35"); //HosName
//         
//        System.out.println(ip);
//        System.out.println(ip.getHostAddress());
//        System.out.println(ip.getHostName());
//        
//        InetAddress localip = InetAddress.getLocalHost(); //using local ip
//        System.out.println(localip);
//        System.out.println(localip.getHostName());
//        System.out.println(localip.getHostAddress());
//        
//        InetAddress ab = InetAddress.getByName("localhost");
//        System.out.println(ab);
//        
//        byte[] myip = {(byte)157,(byte)240,16,35,};
//        
//        InetAddress x = InetAddress.getByAddress(myip);
//        System.out.println(x.getHostName());
//        
//        InetAddress loopbackip = InetAddress.getLoopbackAddress(); //127.0.0.1
//        System.out.println(loopbackip);
        
        InetAddress iptest = InetAddress.getByName("127.0.1.1");
        
        System.out.println(iptest.isLoopbackAddress());
        
        
    }
}
