import java.net.*;
public class NetworkBasic
{
    public static void main(String[] args) 
    { try{
        URL url = new URL("http://www.google.com");
        System.out.println(url.getProtocol());
                System.out.println(url.getHost());
                System.out.println(url.getPort());
    }
    catch(MalformedURLException e)
    {
        
    }
    }
}