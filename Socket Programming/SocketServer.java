import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class SocketServer 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Socket Server");
        ServerSocket ss = new ServerSocket(8000);
        System.out.println("Client is Waiting for Server ");
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Client Sends : "+str);

        System.out.println("Sending Data to Client");
        String str1 = str.substring(0, 6);

        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw = new PrintWriter(osw);
        pw.println(str1);
        pw.flush();

        System.out.println("Data is Send to Client from Server");

        ss.close();
    }   
}
