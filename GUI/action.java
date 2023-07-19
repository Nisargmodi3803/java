import java.awt.*;
import java.awt.event.*;

class action extends Frame implements ActionListener
{
    Button b = new Button("Submit");

    action()
    {
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        setBackground(Color.red);
        // System.exit(0);
    }

    public static void main(String args[])
    {
        action a = new action();
    }
}