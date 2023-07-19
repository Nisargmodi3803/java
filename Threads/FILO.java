/*
    Write a Program in which you are inserting an element in array using one thread.
    Create another thread which is removing the elements from the array in FIFO manner.
    Use Synchronized Block.
*/

class Elements
{
    int []arr = new int[5];
    int rear=-1;

    public void Insert(int a)
    {
        synchronized(this)
        {
            if(rear==-1)
            {
                rear++;
            }

            arr[rear] = a;
            rear++;
        }
    }

    public void Delete()
    {
        synchronized(this)
        {
            if(rear==-1)
            {
                System.out.println("All the Elements are deleted");
            }

            System.out.print(arr[rear--]+" ");
        }
    }

}

class MyThread1 implements Runnable
{
    Elements e;

    MyThread1(Elements e)
    {
        this.e = e;
    }

    @Override
    public void run() 
    {
        e.Insert(1);
        e.Insert(2);
        e.Insert(3);
        e.Insert(4);
        e.Insert(5);
    }
}

class MyThread2 implements Runnable
{
    Elements e;
    MyThread2(Elements e)
    {
        this.e = e;
    }

    @Override
    public void run() 
    {
        System.out.print("FILO Manner : ");
        e.Delete();
        e.Delete();
        e.Delete();
        e.Delete();
        e.Delete();
    }
}

public class FILO 
{
    public static void main(String args[])
    {
        Elements e = new Elements();

        MyThread1 mt1 = new MyThread1(e);
        Thread t1 = new Thread(mt1);
        
        MyThread2 mt2 = new MyThread2(e);
        Thread t2 =new Thread(mt2);
        
        t1.run();
        t2.run();
    }
}
