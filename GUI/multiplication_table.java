import java.awt.*;
import java.awt.event.*;

class multi extends Frame
{
    multi()
    {
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                String s = Integer.toString(i*j);
                g.drawString(s,30+(30*i),30+(30*j));
            }
        }
    }
}

class multiplication_table
{
    public static void main(String args[])
    {
        multi m = new multi();
    }
}