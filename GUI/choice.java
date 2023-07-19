import java.awt.*;

class choice extends Frame
{
    Choice c = new Choice();

    choice()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        c.setBounds(200,200,50,20);
        add(c);
        c.add("pen");
        c.add("pencil");
        c.add("scale");
    }

    public static void main(String args[])
    {
        choice c = new choice();
    }
}