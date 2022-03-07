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
import java.util.Date;

/**
 *
 * @author Dipendra
 */
public class ReadeHeaderInfo {
    public static void main(String[] args) {
        
        try{
            URL url = new URL("https://www.kbc.edu.np");
            URLConnection conn = url.openConnection();
            System.out.println(conn.getContentType());
            System.out.println(conn.getContentLength());
            System.out.println(conn.getContentEncoding());
            Date date = new Date(conn.getDate());
            System.out.println(date);
            System.out.println("Expiration:"+conn.getExpiration());
            System.out.println("Last modified:"+conn.getLastModified());
            System.out.println("Using arbitary method");
            System.out.println(conn.getHeaderField("content-type"));
            System.out.println(conn.getHeaderField("content-length"));
            System.out.println(conn.getHeaderField("content-encoding"));
            System.out.println(conn.getHeaderField("date"));
            System.out.println(conn.getHeaderField("expires"));
            System.out.println("Indexing techniques");
            System.out.println(conn.getHeaderFieldKey(1));
            System.out.println(conn.getHeaderFieldKey(2));
            System.out.println(conn.getHeaderFieldKey(3));
            System.out.println(conn.getHeaderFieldKey(4));
            System.out.println(conn.getHeaderFieldKey(5));
            System.out.println(conn.getHeaderFieldKey(6));
            System.out.println(conn.getHeaderFieldKey(7));
            System.out.println("Reterving value using indexing techniques");
             System.out.println(conn.getHeaderField(1));
            System.out.println(conn.getHeaderField(2));
            System.out.println(conn.getHeaderField(3));
            System.out.println(conn.getHeaderField(4));
            System.out.println(conn.getHeaderField(5));
            
            
            
        }catch(MalformedURLException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
}
