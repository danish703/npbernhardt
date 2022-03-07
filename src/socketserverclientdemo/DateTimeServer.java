
package socketserverclientdemo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {

  public static int DEFAULT_PORT = 13;
  
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(DEFAULT_PORT)){
            while(true){
                try(Socket sc = server.accept()){
                    Writer out = new OutputStreamWriter(sc.getOutputStream());
                    Date date = new Date();
                    out.write("Current Date and Time is :"+date.toString());
                    out.flush();
                    sc.close();
                }catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }

    
}
