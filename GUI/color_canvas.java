import java.awt.*;
import java.awt.event.*;


//Canvas....
class myCanvas extends Canvas
{
    myCanvas()
    {
        setSize(100,100);
        setVisible(true);
    }
}


//Frame...
class color_canvas extends Frame implements ActionListener
{
    Button b1 = new Button("Red");
    Button b2 = new Button("Green");
    Button b3 = new Button("Blue");
    myCanvas mc = new myCanvas();

    color_canvas()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.yellow);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        add(b1);
        add(b2);
        add(b3);
        add(mc);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            mc.setBackground(Color.red);
        }
        if(e.getSource() == b2)
        {
            mc.setBackground(Color.green);
        }
        if(e.getSource() == b3)
        {
            mc.setBackground(Color.blue);
        }
    }

    public static void main(String args[])
    {
        color_canvas c = new color_canvas();
    }
}