import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class SocketClient 
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("LocalHost",8000);

        System.out.println("Sending Data to Server");
        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw = new PrintWriter(osw);
        pw.println("Nisarg Modi");
        pw.flush();

        System.out.println("Receving data from Server");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Server sends : "+str);

        s.close();
    }
}
