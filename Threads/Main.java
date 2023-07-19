public class Main extends Thread
{
public void run ()
{
System.out.println ("run");
}
public void start ()
{
System.out.println ("start");
run();
}
public static void main (String args[])
{
Main mt = new Main ();
mt.start ();
System.out.println ("main");
}
}
