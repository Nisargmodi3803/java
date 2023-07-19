import java.util.Scanner;

class Try_catch
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try
        {
            int div = a/b;
            System.out.println("Div : "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Div by 0 Exception Occur");
        }
        
        sc.close();
    }
}