class Priority extends Thread
{
    public static void main(String args[])
    {
        Priority t = new Priority();

        System.out.println("Current Priority : "+t.getPriority());
        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Current Priority : "+t.getPriority());
    }
}