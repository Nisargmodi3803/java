class Exceptional
{
    public static void main(String args[])
    {
        // try
        // {
        //     int d = 50/0;
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }

        try
        {
            try
            {
                int []a = new int[5];
                a[5] = 10;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}