import java.util.*;

class MyException extends Exception
{
    @Override
    public String toString() 
    {
        return("You are not an adult");
    }
}

class Check_Exception
{
    void check_Age(int age)
    {
        if(age<18)
        {
            try
            {
                throw new MyException();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("You are an adult");
        }
    }
}

public class Custom_Exception 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        Check_Exception ce = new Check_Exception();

        ce.check_Age(age);

        sc.close();
    }
}
