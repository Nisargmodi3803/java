import java.awt.*;
import java.awt.event.*;

class perform extends Frame
{
    perform()
    {
        setSize(500,500);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent e)
            {
                repaint();
            }

            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        g.drawRect(150,150,200,100);
    }
}

class windowframe
{
    public static void main(String args[])
    {
        perform p = new perform();
    }
}