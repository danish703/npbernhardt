/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientToServerMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dipendra
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1235);
        System.out.println("server is stared");
        server.setSoTimeout(40000);
        Socket socket = server.accept();
        BufferedReader reader = 
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while(true){
            String msg = reader.readLine();
            if(msg.equalsIgnoreCase("exit")){
                System.out.println("Connnection terminated by client");
                System.exit(1);
            }
            System.out.println("Client:"+msg);
        }
    }
}
