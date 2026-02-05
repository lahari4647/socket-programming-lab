import java.io.*;
import java.net.*;
import java.util.Date;

public class DateServer {
    public static void main(String[] args) {
        try {
            int port = 8080; // free port
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Date Server started...");
            System.out.println("Waiting for client connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println(new Date().toString());

            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
