import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Area_Circle_Server 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(9998);
        System.out.println("Server is Waiting for Client");

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));//For Receving Data from Client....

        int Radius = Integer.parseInt(br.readLine());
        double PI = Double.parseDouble(br.readLine());

        System.out.println("Radius of Circle : "+Radius);
        System.out.println("Value of PI : "+PI);

        Double Area = PI*Radius*Radius;

        PrintWriter pw = new PrintWriter(s.getOutputStream());// For Sending Data to Client....
        pw.println(Area);
        pw.flush();

        ss.close();
    }    
}
