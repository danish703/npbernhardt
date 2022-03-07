/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclientcommunicate;

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
        System.out.println("Server is running");
        ServerSocket server = new ServerSocket(1856);
        Socket sc = server.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int sum = n1+n2;
        System.out.println("Addition="+sum);
        sc.close();
        server.close();
    }
}
