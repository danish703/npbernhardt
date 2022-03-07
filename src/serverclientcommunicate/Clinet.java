/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclientcommunicate;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Dipendra
 */
public class Clinet {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("127.0.0.1",1856);
        PrintWriter out = new PrintWriter(sc.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st num:");
        int n1 = scanner.nextInt();
        out.println(n1);
        System.out.println("Enter 2nd num:");
        int n2 = scanner.nextInt();
        out.println(n2);
        out.flush();
        sc.close();
        
        
    }
}
