import java.io.*;

public class Calculator 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number-1 : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter Number-2 : ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("Enter Operation to be performed : ");
        String op = br.readLine();

        if(op.equals("+"))
        {
            System.out.println("Addition : "+(num1+num2));
        }
        else if (op.equals("-")) 
        {
            System.out.println("Subtration : "+(num1-num2));
        } 
        else if(op.equals("*") || op.equals("x") || op.equals("X"))
        {
            System.out.println("Multiplication : "+(num1*num2));
        }
        else if(op.equals("/"))
        {
            System.out.println("Division : "+(Double)(num1*1.0/num2));
        }
        else
        {
            System.out.println("Invalid Operation");
        }

    }    
}
