import java.io.*;
import java.net.*;

public class url_ 
{
    public static void main(String[] args) throws Exception
    {
        URL u = new URL("http://D://CORE JAVA//Input & Output//f1.txt");
        System.out.println("get hostname : "+u.getHost());
        System.out.println("get file : "+u.getFile());
        System.out.println("get port : "+u.getPort());

        URLConnection uc = u.openConnection();
        InputStream is = uc.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String s;

        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
    }
}
