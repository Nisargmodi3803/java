import java.io.*;

public class copy_File 
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("D:\\CORE JAVA\\Input & Output\\f1.txt");
        File f2 = new File("D:\\CORE JAVA\\Input & Output\\f2.txt");

        FileInputStream fis = new FileInputStream(f1);
        FileWriter fw = new FileWriter(f2);
        int size = fis.available();

        for(int i=0;i<size;i++)
        {
            fw.write((char)fis.read());
        }

        fw.close();fis.close();
    }    
}
