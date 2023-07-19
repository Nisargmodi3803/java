class Table
{
    public synchronized void printtable(int n)
    {
        for(int i=1;i<=10;i++)
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

class Thread1 extends Thread
{
    Table t;        //Variable of Table Class reference....
    Thread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        // System.out.println("Thread1 is Running");
        t.printtable(2);
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
        // System.out.println("Thread2 is Running");
        t.printtable(3);
    }
}

class Synchronized_Method
{
    public static void main(String args[])
    {
        Table obj = new Table();        //Object of Table class....
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}