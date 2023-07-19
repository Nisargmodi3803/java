import java.awt.*;
import java.awt.event.*;

class figure extends Frame
{
    figure()
    {
        setSize(500,500);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawRect(200,200,100,100);
        g.drawOval(200,200,100,100);
        g.drawLine(250,200,250,300);
        g.drawLine(200,250,300,250);
        g.drawLine(215,215,285,285);
        g.drawLine(215,285,285,215);
    }
}

class diagram
{
    public static void main(String args[])
    {
        figure f = new figure();
    }
}