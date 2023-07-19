import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Area_Circle_Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("LocalHost",9998);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(s.getOutputStream());//For Sending Data to Server....
        System.out.print("Enter Radius of Circle : ");
        int r = Integer.parseInt(br.readLine());
        pw.println(r);
        pw.flush();
        double pi = Math.PI;
        pw.println(pi);
        pw.flush();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));// For Receving Data from Server....
        Double Area = Double.parseDouble(br1.readLine());

        System.out.println("Area of Circle : "+Area);

        s.close();
    }
}
