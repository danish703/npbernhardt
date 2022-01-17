
package npbernhardt;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPV4Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getByName("143.23.22.22");
        Inet4Address ip2 = (Inet4Address) Inet4Address.getByName("143.23.22.22");
        System.out.println(ip1.getHostAddress());
        System.out.println(ip2.getHostAddress());
        System.out.println(ip1.isLoopbackAddress());
        System.out.println(ip2.isLoopbackAddress());
        
        Inet6Address ip3 = (Inet6Address) Inet6Address.getByName("0:0:0:0:0:0:0:FF0E");
        if(ip3.isIPv4CompatibleAddress()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        byte[] x = ip3.getAddress();
        System.out.println(x[7]);
    }
}
