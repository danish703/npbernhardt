
package URLConnectionDemo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    
    public static void main(String[] args) throws IOException {
        String myurl = "https://iitnepal.edu.np/";
        
        try{
            URL url = new URL(myurl);
            URLConnection conn = url.openConnection();
            
            try(InputStream raw = conn.getInputStream()){
                InputStream buffer = new BufferedInputStream(raw);
                Reader reader = new InputStreamReader(buffer);
                int c;
                while((c=reader.read())!=-1){
                    System.out.print((char) c);
                }
            }
            
        }catch(MalformedURLException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
        
    }
    
}
