import java.net.*;

public class Server
{
    public static void main(String[] args){
        try{

        ServerSocket server = new ServerSocket(24444);
        Socket socket = server.accept();
    }
    catch(Exception exception){
        
    }
    }

}