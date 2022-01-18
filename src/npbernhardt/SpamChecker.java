
package npbernhardt;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamChecker {
  public static final String blackhole = "spamhaus.org/sbl"; 
    
  private static boolean isSpammer(String ip){
      try{
          InetAddress address = InetAddress.getByName(ip);
          byte[] quad = address.getAddress(); //[124,56,44,33]
          String query = blackhole;
          for(byte oc:quad){
              int unsignedByte = oc<0?oc+256:oc;  //-44+356 
              query= unsignedByte+"."+query;
          }
          InetAddress.getByName(query);
          return true;
      }catch(UnknownHostException ex){
       return false;
      }
  }

    public static void main(String[] args) {
        String[] ips = {"207.34.56.23","34.23.232.22","145.23.34.12"};
        SpamChecker sc = new SpamChecker();
        for(String ip:ips){
           System.out.println(sc.isSpammer(ip));
        }   
    }

    
}
