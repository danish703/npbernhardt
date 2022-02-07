/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npbernhardt;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        String surl = "https://www.kbc.edu.np:443/media/organizationdetails/logo_1_zz4T052.png?key1=hello&key2=dg#abcxyz";
        URL url1 = new URL(surl); 
        System.out.println(surl);
        System.out.println(url1);
        URL url2 = new URL("https","www.kbc.edu.np","/media/organizationdetails/logo_1_zz4T052.png");
        
        URL url3 = new URL("https","www.kbc.edu.np",443,"/media/organizationdetails/logo_1_zz4T052.png");
        
        
        System.out.println(url2);
        System.out.println(url3);
        
        URL baseURL = new URL("https://www.kbc.edu.np");
        String rUrl = "/program/1";
        
        URL absURL = new URL(baseURL,rUrl);
        System.out.println(absURL);
        
        // url1
        System.out.println(url1.getProtocol());
        System.out.println(url1.getAuthority());
        System.out.println(url1.getPort());
        System.out.println(url1.getFile());
        System.out.println(url1.getQuery());
        System.out.println(url1.getPort());
        System.out.println(url1.getUserInfo());
        System.out.println(url1.getHost());
        System.out.println(url1.getRef());
        
        //URLConnection con = url1.openConnection();
        
    }
}
