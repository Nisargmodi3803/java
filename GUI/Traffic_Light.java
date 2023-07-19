import java.awt.*;
import java.awt.event.*;

class Traffic_Light extends Frame implements ActionListener
{
    int a;
    MenuBar mb = new MenuBar();
    Menu m = new Menu("LIGHT");
    MenuItem I1 = new MenuItem("RED");
    MenuItem I2 = new MenuItem("YELLOW");
    MenuItem I3 = new MenuItem("GREEN");

    Traffic_Light()
    {
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        setMenuBar(mb);
        mb.add(m);
        m.add(I1);
        m.add(I2);
        m.add(I3);

        I1.addActionListener(this);
        I2.addActionListener(this);
        I3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == I1)
        {
            a=1;
            repaint();
        }

        else if(e.getSource() == I2)
        {
            a=2;
            repaint();
        }

        else if(e.getSource() == I3)
        {
            a=3;
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.drawOval(100,50,100,100);
        g.drawOval(100,160,100,100);
        g.drawOval(100,270,100,100);

        if(a==1)
        {
            g.setColor(Color.red);
            g.fillOval(100,50,100,100);
        }

        else if(a==2)
        {
            g.setColor(Color.yellow);
            g.fillOval(100,160,100,100);
        }

        else if(a==3)
        {
            g.setColor(Color.green);
            g.fillOval(100,270,100,100);
        }
    }

    public static void main(String args[])
    {
        Traffic_Light TL = new Traffic_Light();
    }
}