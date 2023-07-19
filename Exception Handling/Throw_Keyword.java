import java.util.Scanner;

public class Throw_Keyword 
{
    static void neg_num(int a)
    {
        if(a<0)
        {
            throw new ArithmeticException("-ve Number found Exception");
        }
        else
        {
            System.out.println("Number = "+a);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter number : ");
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
