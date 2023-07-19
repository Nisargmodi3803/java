class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println("Thread is Running");
    }
}

class My_Thread implements Runnable
{
    public void run()
    {
        System.out.println("Thread is Running");
    }
}

class Constructor
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread("Nisarg");
        t1.start();

        System.out.println("ID of Thread is "+t1.getId());
        System.out.println("Name of Thread is "+t1.getName());

        System.out.println();

        My_Thread t2 = new My_Thread();
        Thread t = new Thread(t2,"Modi");
        t2.run();
        System.out.println("ID of Thread is "+t.getId());
        System.out.println("Name of Thread is "+t.getName());

    }
}