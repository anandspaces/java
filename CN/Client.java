import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String SERVER_HOST = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try {
            Socket clientSocket = new Socket(SERVER_HOST, SERVER_PORT);

            // Receive the response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String response = in.readLine();
            System.out.println("Received from server: " + response);

            // Close the connection
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
