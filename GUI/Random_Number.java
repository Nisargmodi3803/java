import java.awt.*;
import java.awt.event.*;

class clicked extends Frame
{
    int x,y;

    clicked()
    {
        setSize(500,500);
        setVisible(true);
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g)
    {
        String s1 = Integer.toString(x);
        String s2 = Integer.toString(y);

        g.drawString("("+s1+","+s2+")",250,250);
    }
}

class Random_Number
{
    public static void main(String args[])
    {
        clicked c = new clicked();
    }
}