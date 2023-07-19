class MyThread extends Thread
{
    public void run()
    {
        // System.out.println("Thread is Running");
        // System.out.println();

        for(int i=0;i<10;i++)
        {
            System.out.println("Run Method : "+i);
        }
    }

    // public void start()
    // {
    //     for(int i=0;i<10;i++)
    //     {
    //         System.out.println("Start Method : "+i);
    //     }
    // }
}

class Extends_Thread
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread();
        t1.start();
        // t1.run();
        // t1.start(); // Throws Exception...

        for(int i=0;i<10;i++)
        {
            System.out.println("Main : "+i);
        }
    }
}