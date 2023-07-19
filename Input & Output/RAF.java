import java.io.*;

public class RAF
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\CORE JAVA\\Input & Output\\f2.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "rw");

        raf.seek(6);
        raf.writeChar('W');
        raf.skipBytes(5);
        raf.writeChar('H');

        raf.close();
    }
}
