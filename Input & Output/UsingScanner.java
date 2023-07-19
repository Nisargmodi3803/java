import java.util.*;

class UsingScanner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //File f = new File("D:\\CORE JAVA\\Input & Output\\f1.txt");
        
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }        

        sc.close();
    }
}

