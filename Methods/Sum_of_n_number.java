import java.util.*;

class Sum_of_n_number
{
    static int SumNumber(int n)
    {
        int sum;

        if(n==0)
        {
            return 0;
        }
        else
        {
            sum = n + SumNumber(n-1);
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int sum = SumNumber(n);

        System.out.println("Sum of first "+n+" number is "+sum);
    }
}