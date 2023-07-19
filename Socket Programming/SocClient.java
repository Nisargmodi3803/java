import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

class SocClient
{
    public static void main(String[] args) throws Exception
    {
        String IP = "LocalHost";
        int port = 9999;  //0-1023 are reserved and 1024 - 65535 we can use

        Socket s = new Socket(IP, port);

        String name = "Nisarg Modi";

        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());

        PrintWriter pw = new PrintWriter(osw);
        pw.write(name);
        pw.flush();

        s.close();
    }
}