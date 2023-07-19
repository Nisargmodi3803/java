import java.util.*;

class Add_two_Matrix2x3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int [][] m1 = new int[2][3];
        int [][] m2 = new int[2][3];

        System.out.println("Enter Elements of Matrix m1");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements of Matrix m2");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        int [][] sum = new int[2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Sum of Matrix m1 and m2 ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }

}