import java.awt.*;
import java.awt.event.*;

class setBound_method extends Frame 
{
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");

    setBound_method()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        b1.setBounds(200,50,100,30);
        b2.setBounds(200,100,100,30);
        b3.setBounds(200,150,100,30);
        b4.setBounds(200,200,100,30);
        b5.setBounds(200,250,100,30);
        b6.setBounds(200,300,100,30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

    public static void main(String args[])
    {
        setBound_method sb = new setBound_method();
    }

} 