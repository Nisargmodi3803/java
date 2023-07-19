import java.awt.*;
import java.awt.event.*;

public class key_Listener extends Frame implements KeyListener
{
    int x = 150;
    int y = 150;
    String A = "NISARG";

    key_Listener()
    {
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == e.VK_UP)
        {
            y-=10;
        }
        else if(e.getKeyCode() == e.VK_DOWN)
        {
            y+=10;
        }
        else if(e.getKeyCode() == e.VK_LEFT)
        {
            x-=10;
        }
        else if(e.getKeyCode() == e.VK_RIGHT)
        {
            x+=10;
        }

        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(A,x,y);
    }

    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public static void main(String[] args) 
    {
        key_Listener kl = new key_Listener();
    }
}
