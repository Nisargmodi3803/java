import java.io.*;

public class DataStream 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f3.txt");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        int a=10;
        
        for(int i=0;i<10;i++)
        {
            dos.writeInt((int)(a+10));
        }

        if(dos!=null)
        {
            dos.close();
        }
    }
}
