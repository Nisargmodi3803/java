import java.util.Scanner;

public class Throws_Keyword 
{
    static void neg_num(int a) throws ArrayIndexOutOfBoundsException
    {
        int [] arr = new int[5];
        arr[a] = 0;

        System.out.println("arr["+a+"] = 0");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter Index : ");
            int a = sc.nextInt();
            neg_num(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        sc.close();
    }    
}
