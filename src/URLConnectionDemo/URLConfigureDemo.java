/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLConnectionDemo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Dipendra
 */
public class URLConfigureDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.kbcasdklfhaskl.edu.np");
        
        URLConnection conn = url.openConnection();
        conn.setConnectTimeout(20000);
    }
    
}
