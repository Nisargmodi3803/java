import java.io.*;

public class Create_new_file 
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f3.txt");
        f.createNewFile();
    }
}
