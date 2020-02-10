package non;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try{

            ServerSocket server = new ServerSocket(24444);
            Socket socket = server.accept();
        }
        catch(Exception exception){
            
        }
    }
}
