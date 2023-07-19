import java.awt.*;

class print extends Frame
{
    print()
    {
        setSize(500,500);
        setVisible(true);
        setBackground(Color.red);
        setForeground(Color.yellow);
    }

    public void paint(Graphics g)
    {
        g.drawString("Hello World",50,50);
    }

    public static void main(String args[])
    {
        print p = new print();
        p.repaint();
    }
}