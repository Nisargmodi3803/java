import java.net.InetAddress;

public class Printing_Address 
{
    public static void main(String[] args) throws Exception
    {
        InetAddress ip = InetAddress.getByName("LocalHost");

        System.out.println("HostName : "+ip.getHostName());
        System.out.println("HostAddress : "+ip.getHostAddress());
    }    
}
