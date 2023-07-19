import java.io.*;

class char_by_char
{
    public static void main(String[] args) throws IOException
    {
        // FileInputStream fis = new FileInputStream("D:\\CORE JAVA\\Input & Output\\f1.txt"); //For any File
        FileInputStream fis = new FileInputStream("D:\\CORE JAVA\\Input & Output\\char_by_char.java");//For Current java file...

        int size = fis.available();

        for(int i=0;i<size;i++)
        {
            System.out.print((char)fis.read());
        }

        fis.close();
    }
}
