import java.io.*;

public class DataStream_input
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f2.txt");
        DataInputStream dis = new DataInputStream(new FileInputStream(f));

        for(int i=0;i<dis.available();i++)
        {
            System.out.print(dis.readChar()); 
        }

        dis.close();

        
    }
}
