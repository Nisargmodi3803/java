/*
import java.awt.*;
import java.awt.event.*;

class mouse extends Frame implements MouseListener
{
    mouse()
    {
        setSize(400,400);
        setVisible(true);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){System.exit(0);}
    public void mouseClicked(MouseEvent e)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawRect(70,70,50,70);
    }

    public static void main(String args[])
    {
        mouse m = new mouse();
    }
}

*/

import java.awt.*;
import java.awt.event.*;

class mouse extends Frame implements MouseListener
{
    int x , y;
    mouse()
    {
        setSize(400,400);
        setVisible(true);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e)
    {
        
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        x = e.getX();
        y = e.getY();
    }
    

    public void paint(Graphics g)
    {
        String s = Integer.toString(x);
        String n = Integer.toString(y);

        g.drawString("("+s+","+n+")",100,100);
    }

    public static void main(String args[])
    {
        mouse m = new mouse();
    }
}