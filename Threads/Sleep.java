/*
class Sleep extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even : "+i);
                try
                {
                    Thread.sleep(3000);
                }
                catch(Exception e)
                {
                    System.out.println("Exception caught");
                }
            }
            else
            {
                System.out.println("Odd : "+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Exception caught");
                }
            }
        }
    }

    public static void main(String args[])
    {
        Sleep s = new Sleep();
        s.start();
    }
}
*/


class Thread1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd : "+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Exception caught");
                }
            }
        }
    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even : "+i);
                try
                {
                    Thread.sleep(3000);
                }
                catch(Exception e)
                {
                    System.out.println("Exception caught");
                }
            }
        }
    }
}

class Sleep
{
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        Thread s1 = new Thread(t1);
        Thread s2 = new Thread(t2);
        s1.start();
        s2.start();
    }
}


