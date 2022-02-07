/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npbernhardt;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

/**
 *
 * @author Dipendra
 */
public class ProxyClassDemo {
    
    public static void main(String[] args) {
        //suppose we have the server of ip address  196.24.14.15 http  port no 80;
        String ip = "196.24.14.15";
        SocketAddress address = new InetSocketAddress(ip,80);
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        //suppose we have another server of ip address 178.48.14.56 socks port 9000
        String ip2 = "178.48.14.56";
        SocketAddress address2 = new InetSocketAddress(ip2,9000);
        Proxy proxy2 = new Proxy(Proxy.Type.DIRECT,address);
        
    }
    
}
