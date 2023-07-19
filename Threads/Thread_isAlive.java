class Thread_isAlive implements Runnable
{
    public void run()
    {
        System.out.println("In Run method thread is running or not : "+Thread.currentThread().isAlive());
    }

    public static void main(String args[])
    {
        Thread_isAlive TA = new Thread_isAlive();
        Thread t = new Thread(TA);
        System.out.println("Before Run Thread Running or not : "+t.isAlive());
        t.start();
        System.out.println("After Run Thread Running or not : "+t.isAlive());
    }
}