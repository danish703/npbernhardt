package npbernhardt;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class NetworkInterfaceDemo {

    public void getByNameDemo() {
        String interfaceName = "eth0";
        try {
            NetworkInterface nif = NetworkInterface.getByName(interfaceName);
            System.out.println(nif);
        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void getByInetAddressDemo() throws UnknownHostException, SocketException{
      InetAddress ip = InetAddress.getByName("0.0.0.0");
      NetworkInterface nif = NetworkInterface.getByInetAddress(ip);
      if(nif==null){
          System.out.println("this ip address is not bound with any interface");
      }else{
          System.out.println(nif);
      }
      
    }

    public static void main(String[] args) throws UnknownHostException, SocketException {
             NetworkInterfaceDemo np = new NetworkInterfaceDemo();
             //np.getByNameDemo();
             np.getByInetAddressDemo();
    }
}
