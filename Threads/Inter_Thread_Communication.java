class Balance extends Thread
{
    int acc_balance=0;
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child class Thread Invoke");
            
            for(int i=1;i<10;i++)
            {
                acc_balance+=i;
            }

            try
            {
                this.notify();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Child class invoke notify method");
        }
    }
}

class Inter_Thread_Communication
{
    public static void main(String args[])
    {
        Balance b = new Balance();
        b.start();

        synchronized(b)
        {
            System.out.println("Main class Thread invoke");
            try
            {
                b.wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Main Method get Notify");
            System.out.println("Balance = "+b.acc_balance);
        }
    }
}