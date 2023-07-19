class print 
{
    synchronized void printNum(int n)
    {
        try
        {
            this.notify();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

class Thread1 extends Thread
{
    print p;
    Thread1(print p)
    {
        this.p=p;
    }

    public void run()
    {
        p.printNum(10);
    }
}

class odd_even
{
    public static void main(String args[])
    {
        print obj = new print();

        Thread1 t1 = new Thread1(obj);
        t1.start();

        synchronized(t1)
        {
            try
            {
                t1.wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}