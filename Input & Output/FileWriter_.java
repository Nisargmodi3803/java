import java.io.*;

public class FileWriter_ 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f2.txt");
        
        if(f.exists())
        {
            FileWriter fw = new FileWriter(f);
            fw.write("Hello World");

            fw.close();
        }
        else
        {
            System.out.println("File does't Exists");
        }
    }
}
