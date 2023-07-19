import java.io.*;

public class ReadFirst10_Last10
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fis = new FileInputStream("D:\\CORE JAVA\\Input & Output\\ReadFirst10_Last10.java");
        int size = fis.available();

        for(int i=0;i<20;i++)
        {
            System.out.print((char)fis.read());
        }

        System.out.println();
        
        fis.skip(size-40);

        for(int i=0;i<20;i++)
        {
            System.out.print((char)fis.read());
        }

        fis.close();
    } 
}
