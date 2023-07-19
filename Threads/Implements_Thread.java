class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("Thread is Running");
        System.out.println();

        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}

class Implements_Thread
{
    public static void main(String args[])
    {
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start();
    }
}