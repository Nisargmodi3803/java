class Thread1 implements Runnable
{
    public void run()
    {
        System.out.println("Thread1-"+Thread.currentThread().getName());

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread2-"+Thread.currentThread().getName());

        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


class Thread_Group
{
    public static void main(String args[])
    {
        Thread1 mt1 = new Thread1();
        Thread2 mt2 = new Thread2();

        ThreadGroup tg1 = new ThreadGroup("First Group");
        ThreadGroup tg2 = new ThreadGroup("Second Group");

        Thread t1 = new Thread(tg1,mt1,"First");
        Thread t2 = new Thread(tg1,mt1,"Second");
        Thread t3 = new Thread(tg1,mt1,"Third");
        Thread t4 = new Thread(tg2,mt2,"first");
        Thread t5 = new Thread(tg2,mt2,"Second");
        Thread t6 = new Thread(tg2,mt2,"Third");

        t1.start();
        t3.start();
        t2.start();
        t5.start();
        t4.start();
        t6.start();

        System.out.println("Current active thread : "+ tg1.activeCount());
        System.out.println("Current active thread : "+ tg2.activeCount());
        System.out.println("Current active group thread : "+ tg1.activeGroupCount());
        System.out.println("Current active group thread : "+ tg2.activeGroupCount());
    }
}