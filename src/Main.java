import java.io.*;
import java.net.Socket;

public class Main {

    private static String host = "localhost";
    private static int port = 1213;

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        lectura de la consola
//        lectura no válida
//        InputStream is = System.in;
//        DataInputStream dis = new DataInputStream(is);
//        no funciona, no llegeix salts de línia
//          dis.readUTF();
//        no funciona, no llegeix bé caràcters amb accent
//            String lectura = dis.readLine();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {

            // Creació de socket
            Socket s = new Socket(host, port);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String cadenaLlegida = "";
            String lectura = br.readLine();

            // fer bucle: mentre cadena llegida != FI
            // enviar cadena, llegir retorn i pintar-lo per consola
            while(1 == 1){
                ;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}