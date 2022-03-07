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
public class AllHeaderInfo {
    public static void main(String[] args) {
        try{
            URL  url = new URL("https://kbc.edu.np");
            URLConnection conn = url.openConnection();
            for(int i=1;;i++){
                String header = conn.getHeaderField(i);
                if(header==null) break;
                System.out.println(conn.getHeaderFieldKey(i)+"="+header);
            }
        }catch(MalformedURLException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
   
}
