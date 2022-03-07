/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientToServerMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Dipendra
 */
public class Client {
    
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1235);
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(socket.getOutputStream());
        while(true){
            System.out.println("Enter message: ");
            String msg  = reader.readLine();
            out.println(msg);
            if(msg.equalsIgnoreCase("exit")){
                System.out.println("Connection close");
                System.exit(1);
            }
           out.flush();
        }
        
    }
}
