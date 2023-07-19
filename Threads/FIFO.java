/*
    Write a Program in which you are inserting an element in array using one thread.
    Create another thread which is removing the elements from the array in FIFO manner.
    Use Synchronized Method.
*/

class Elements
{
    public int []arr = new int[5];
    int front,rear= -1;
    
    synchronized public void Insert(int a)
    {
        if(front == -1)
            front++;rear++;

        arr[rear] = a;
    }

    synchronized public void Delete()
    {
        if(front==-1 || front > rear)
        {
            System.out.println("All the Elements are deleted");
        }

        System.out.print(arr[front]+" ");
        front++;
    }
}

class MyThread1 extends Thread
{
    Elements e;
    MyThread1(Elements e)
    {
        this.e = e;
    }

    public void run()
    {
        e.Insert(1);
        e.Insert(2);
        e.Insert(3);
        e.Insert(4);
        e.Insert(5);
    }
}


class MyThread2 extends Thread
{
    Elements e;

    public MyThread2(Elements e)
    {
        this.e = e;
    }

    public void run()
    {
        System.out.print("FIFO Manner : ");
        e.Delete();
        e.Delete();
        e.Delete();
        e.Delete();
        e.Delete();
    }
}


public class FIFO 
{
    public static void main(String[] args) 
    {
        Elements e = new Elements();
        
        MyThread1 mt1 = new MyThread1(e);
        MyThread2 mt2 = new MyThread2(e);

        mt1.run();
        mt2.run();
    }
}
