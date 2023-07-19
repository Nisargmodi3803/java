import java.util.Scanner;

public class Nested_Try_Catch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.print("Enter two Number : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int div = a/b;
            System.out.println("Div = "+div);

            try
            {
                int [] arr = new int[5];
                System.out.print("Enter Index : ");
                int n = sc.nextInt();
                arr[n] = 57;
                System.out.println("arr["+n+"] = 57");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index out of bound Exception occured");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Div by 0 Exception Occured");
        }

        sc.close();
    }    
}
