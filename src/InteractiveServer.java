import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class InteractiveServer {
    private static int port = 1213;

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("A la espera de connexions.");
            Socket socket = ss.accept();
            System.out.println("Ha arribat un client");

            // llegir de l'input
            // passar a majúscula
            // enviar-ho per output
            // tancar el client si ha enviat "FI"


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
