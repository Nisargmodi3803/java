import java.util.*;

class Max_Min
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int repeat_max = 0;
        int repeat_min = 0;

        for(int Elements : arr)
        {
            if(Elements > max)
            {
                max = Elements;
            }

            if(Elements < min)
            {
                min = Elements;
            }
        }

        for(int elements : arr)
        {
            if(max == elements)
            {
                repeat_max++;
            }

            if(min == elements)
            {
                repeat_min++;
            }
        }

        System.out.println("Maximum Element in the array is "+max+" and it repeats "+repeat_max+" times.");
        System.out.println("Minimum Element in the array is "+min+" and it repeats "+repeat_min+" times.");
    }
}