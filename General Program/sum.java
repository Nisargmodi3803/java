import java.util.*;

class sum
{
    void sumEven(int n)
    {
        int sum=0,i=0;

        System.out.print("First "+n+" Even Number : ");

        while(i!=(2*n))
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
                sum+=i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of first "+n+" Even Number is "+sum);
    }

    void sumOdd(int n)
    {
        int sum=0,i=0;

        System.out.print("First "+n+" Odd Number : ");

        while(i!=(2*n))
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                sum+=i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of First "+n+" Odd Number is "+sum);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        sum a = new sum();
        System.out.println();
        a.sumEven(n);
        System.out.println();
        a.sumOdd(n);
    }
}