package webserver;

import java.net.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class WebServer {

    public static void main(String args[]) {
        try {
            int serverPort = 6880;
            ServerSocket listenSocket = new ServerSocket(serverPort);

            System.out.println("Server listening on port 6880...");

            while (true) {
                Socket clientSocket = listenSocket.accept();
                InputStream input = clientSocket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(input));

                String request = br.readLine();
                String[] reqArray = request.split(" "); // ['GET', 'index.html', 'HTTP/1.1']

                String filePath = reqArray[1].substring(1); // index.html (or other path): remove the '/'
                //System.out.println("request[0]: " + request[0] + " request[1]: " + request[1] + " nextline: " + nextLine);
                if (filePath != null) {
                    loadPage(clientSocket, "C:\\netbeans\\bin\\NPBernhardt\\src\\webserver\\index.html", br);
                }
                //break;
            }
        } catch (IOException e) {
            System.out.println("Listen :" + e.getMessage());
        }
    }

    public static void loadPage(Socket clientSocket, String filePath, BufferedReader br) {
        try {

            PrintWriter output = new PrintWriter(clientSocket.getOutputStream());
            System.out.println(filePath);
            File file = new File(filePath);
            if (!file.exists()) {
                output.write("HTTP/1.1 404 Not Found\r\n" + "Content-Type: text/html" + "\r\n\r\n");
                System.out.println("File does not exist.  Client requesting file at : " + filePath);
                output.close();
            } else {
                output.write("HTTP/1.1 200 OK\r\n" + "Content-Type: text/html" + "\r\n\r\n");
                byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
                String fileString = new String(fileBytes, StandardCharsets.UTF_8);
                output.write(fileString);

                System.out.println("Finished writing content to output");
                //brFile.close();
                //br.close();
                output.close();

            }

        } catch (IOException e) {
            System.out.println("Connection: " + e.getMessage());
        }
    }
}
