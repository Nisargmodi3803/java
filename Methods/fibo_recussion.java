class fibo_recussion
{
    int fibo(int n)
    {
        if(n==1 || n==2)
            return(n-1);

        else
        {
            return(fibo(n-1) + fibo(n-2));
        }
    }

    public static void main(String args[])
    {
        fibo_recussion a = new fibo_recussion();

        int n = 15;

        int result = a.fibo(n);

        System.out.print(result+" ");
    }
}