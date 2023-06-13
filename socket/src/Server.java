import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(54321);
        //accepting the connection
        Socket socket = serverSocket.accept();
        System.out.println("Connection success!");

        //reading from keyboard
        //taking user input
        BufferedReader bufferedReader = new BufferdReader(new InputStreamReader(System.in));

    }
}