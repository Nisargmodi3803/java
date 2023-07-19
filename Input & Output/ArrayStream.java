import java.io.*;

public class ArrayStream 
{
    public static void main(String[] args) throws IOException
    {
        String s = new String("nisarg ");
        byte[] b = s.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(b);

        int i;

        while((i=bais.read())!=-1)
        {
            System.out.print((char)i);
        }

        bais.reset();
        System.out.println();

        while((i=bais.read())!=-1)
        {
            System.out.print((Character.toUpperCase((char)i)));
        }
    }
}
