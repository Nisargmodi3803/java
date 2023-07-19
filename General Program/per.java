import java.util.*;

class per
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Marks of Subject1 out of 100 : ");
        int sub1 = input.nextInt();
        System.out.print("Enter the Marks of Subject2 out of 100 : ");
        int sub2 = input.nextInt();
        System.out.print("Enter the Marks of Subject3 out of 100 : ");
        int sub3 = input.nextInt();
        System.out.print("Enter the Marks of Subject4 out of 100 : ");
        int sub4 = input.nextInt();
        System.out.print("Enter the Marks of Subject5 out of 100 : ");
        int sub5 = input.nextInt();

        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5)*100f / 500;

        System.out.println("Your Percentage is "+percentage+"%");
    }
}