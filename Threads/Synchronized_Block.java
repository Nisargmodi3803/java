class Table
{
    public void PrintTable(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(n*i);
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
    }
}

class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.PrintTable(20);
    }
}

class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.PrintTable(40);
    }
}

class Synchronized_Block
{
    public static void main(String args[])
    {
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}