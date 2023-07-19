class DaemonThread implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(Thread.currentThread().getName()+" is Daemon thread");
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" is not Daemon thread");

        }
    }

    public static void main(String args[])
    {
        DaemonThread dt = new DaemonThread();

        Thread t1 = new Thread(dt,"T1");
        Thread t2 = new Thread(dt,"T2");
        Thread t3 = new Thread(dt,"T3");

        t1.setDaemon(true);
        t1.start();
        t2.start();

        t3.setDaemon(true);
        t3.start();
    }
}