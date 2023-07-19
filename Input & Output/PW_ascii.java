import java.io.*;

public class PW_ascii 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Address of Current File : ");
        String C_address = br.readLine();

        System.out.print("Enter Address of File : ");
        String address = br.readLine();

        File f1 = new File(C_address);
        File f2= new File(address);

        FileReader fr = new FileReader(f1);
        PrintWriter pw = new PrintWriter(new FileOutputStream(f2));

        for(int i=0;i<10;i++)
        {
            int j;
            while((j=fr.read())!=-1)
            {
                pw.println(j);
            }
        }
    }
}
