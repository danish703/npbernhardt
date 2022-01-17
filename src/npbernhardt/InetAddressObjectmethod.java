package npbernhardt;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressObjectmethod {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getByName("www.google.com");
        System.out.println(ip1.getHostAddress());
        
        InetAddress ip2 = InetAddress.getByName("www.gamil.com");
        System.out.println(ip2.getHostAddress());
        
        System.out.println(ip1.equals(ip2));
        
        if(ip1.hashCode()==ip2.hashCode()){
            System.out.println("they are same");
        }else{
            System.out.println("they are not same");
        }
        
        String s = ip1.toString();
        System.out.println(s);
    }
}
/**
 *  InetAddress   ------ Ip address
 *  to create the object of InetAddress -> getByName,getByAddress, getLocalHost
 *  to distinguish the class of Ip address-
 *  Reachability --> isreachable()
 *  object method ===> equal,hashCode,toString
 * 
 */