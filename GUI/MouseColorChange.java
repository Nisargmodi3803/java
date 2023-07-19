import java.awt.*;
import java.awt.event.*;

class perform extends Frame implements MouseListener
{
    perform()
    {
        setSize(500,500);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.green);
    }
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.blue);
    }
    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.red);
    }
    public void mouseReleased(MouseEvent e){}
}

class MouseColorChange
{
    public static void main(String args[])
    {
        perform p = new perform();
    }
}