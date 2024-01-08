import java.io.*;
import java.net.*;

public class ClientServerSocket 
{
    public static void main(String[] args)
    {
        try{
        ServerSocket sock = new ServerSocket(1111);
        Socket s = sock.accept();
        DataInputStream istream = new DataInputStream(s.getInputStream());
        String str = (String)istream.readUTF();
            System.out.println("Message:"+str);
            sock.close();
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}