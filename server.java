import java.io.*;
import java.net.*;

      public class Server {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(44331);
                System.out.println("Conexiunea serverului Dvs. se asteapta...");

                Socket clientSocket = serverSocket.accept();
                System.out.println("Conexiunea a fost gasita" + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

              String mesajDeLaClient = in.readLine();
              System.out.println("Mesaj de la client: " + mesajDeLaClient);

              System.out.println("Mesaj primit: " + mesajDeLaClient);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
      }
