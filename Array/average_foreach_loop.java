
import java.util.*;

class average_foreach_loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        double [] marks = new double[n];
        double sum = 0;

        System.out.print("Enter Marks : ");
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextDouble();
        }


        System.out.println();

        for(double elements : marks)
        {
            sum+=elements;
        }

        double average = sum/n;
        System.out.println("Total Sum of Marks : "+sum);
        System.out.println("Average : "+average);
    }
}