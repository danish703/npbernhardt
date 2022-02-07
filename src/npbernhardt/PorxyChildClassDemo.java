package npbernhardt;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class PorxyChildClassDemo extends ProxySelector {

    @Override
    public List<Proxy> select(URI uri) {
         String ip = "196.24.14.15";
         SocketAddress address = new InetSocketAddress(ip,80);
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        //suppose we have another server of ip address 178.48.14.56 socks port 9000
        String ip2 = "178.48.14.56";
        SocketAddress address2 = new InetSocketAddress(ip2,9000);
        Proxy proxy2 = new Proxy(Proxy.Type.HTTP,address);
        List<Proxy> listOfProxy = new ArrayList<>();
        listOfProxy.add(proxy);
        listOfProxy.add(proxy2);
        return listOfProxy;
        
        
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);
        
        
        System.setProperty("http.keepAlive","true");
        System.setProperty("http.maxConnections","5");
        System.out.println("Proxy sever is not connected or pass the connection request to the remote server");
    }
    
}
