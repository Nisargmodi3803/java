import java.io.*;

public class print_writer
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f2.txt");
        PrintWriter pw = new PrintWriter(new FileOutputStream(f));

        for(int i=0;i<10;i++)
        {
            pw.print((int)(Math.random()*1000)+" ");
        }

        if(pw!=null)
            pw.close();
    }
}
