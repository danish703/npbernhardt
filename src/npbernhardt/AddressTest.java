/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npbernhardt;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Dipendra
 */
public class AddressTest {
    public static void main(String[] args) throws UnknownHostException {
        String myip = "FF0E::11AF";
        InetAddress ip2 = InetAddress.getByName(myip);
        
        if(ip2.getAddress().length==4){
            System.out.println("IPv4");
        }else if(ip2.getAddress().length==16){
            System.out.println("IPv6");
        }
        
    }
   
}
