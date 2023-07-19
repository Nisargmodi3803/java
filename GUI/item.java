import java.awt.*;
import java.awt.event.*;

class item extends Frame implements ItemListener
{
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Red",cg,false);
    Checkbox c2 = new Checkbox("Green",cg,false);
    Checkbox c3 = new Checkbox("Blue",cg,false);

    item()
    {
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == c1)
        {
            setBackground(Color.red);
        }

        else if(e.getSource() == c2)
        {
            setBackground(Color.green);
        }

        else
        {
            setBackground(Color.blue);
        }
    }

    public static void main(String args[])
    {
        item i = new item();
    }
}