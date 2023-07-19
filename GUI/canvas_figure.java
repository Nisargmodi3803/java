import java.awt.*;
import java.awt.event.*;

class mycanvas extends Canvas
{
    int a;

    mycanvas()
    {
        setSize(300,300);
        setVisible(true);
        setBackground(Color.red);
    }

    void setA(int a)
    {
        this.a = a;
    }

    public void paint(Graphics g)
    {
        if(a==1)
        {
            g.drawOval(50,50,100,100);
        }

        if(a==2)
        {
            g.drawRect(50,50,200,100);
        }

        if(a==3)
        {
            g.drawRect(50,50,100,100);
        }

        if(a==4)
        {
            g.drawRoundRect(50,50,100,100,50,50);
        }

        if(a==5)
        {
            g.drawOval(50,50,100,50);
        }
    }
}

class canvas_figure extends Frame implements ItemListener
{
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Circle",cg,false);
    Checkbox c2 = new Checkbox("Rectangle",cg,false);
    Checkbox c3 = new Checkbox("Square",cg,false);
    Checkbox c4 = new Checkbox("RoundRectangle",cg,false);
    Checkbox c5 = new Checkbox("Elicpse",cg,false);
    mycanvas mc = new mycanvas();

    canvas_figure()
    {
        setSize(700,700);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.cyan);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(mc);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == c1)
        {
            mc.setA(1);
            mc.repaint();
        }

        if(e.getSource() == c2)
        {
            mc.setA(2);
            mc.repaint();
        }

        if(e.getSource() == c3)
        {
            mc.setA(3);
            mc.repaint();
        }

        if(e.getSource() == c4)
        {
            mc.setA(4);
            mc.repaint();
        }
        if(e.getSource() == c5)
        {
            mc.setA(5);
            mc.repaint();
        }
    }

    public static void main(String args[])
    {
        canvas_figure cf = new canvas_figure();
    }
}