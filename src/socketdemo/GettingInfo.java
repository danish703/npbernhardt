
package socketdemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GettingInfo {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(0);
        System.out.println(server.getInetAddress());
        System.out.println(server.getLocalPort());
    }
}
