import java.net.*;

public class Inet 
{
    public static void main(String[] args) throws Exception
    {
        InetAddress add = InetAddress.getByName("http://D://CORE JAVA//Input & Output//f1.txt");

        System.out.println("Get HostName : "+add.getHostName());
        System.out.println("Get HostAddress :"+add.getHostAddress());
    }
}
