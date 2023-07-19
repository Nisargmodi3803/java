import java.io.*;

public class ReadConsole //By this we can take input from user without using scanner class.
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter String : ");
        String s = br.readLine();

        System.out.println("Number is "+a);
        System.out.println("String is "+s);
    }
}
