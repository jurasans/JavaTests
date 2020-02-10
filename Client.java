import java.io.IOException;
import java.net.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 24444);
            System.out.println("Conneted!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}