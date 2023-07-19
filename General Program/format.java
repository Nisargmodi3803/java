public class format
{
    public static void main(String[] args) 
    {
        char a = 'n';
        boolean b = true;
        float f = 1000.20010f;

        System.out.printf("%5c\n", a);    
        System.out.printf("%7b\n", b);    
        System.out.printf("%1.2f\n", f);    
        System.out.printf("%10.2f\n", f);    
    }
}
