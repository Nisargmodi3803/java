import java.awt.*;
import java.awt.event.*;

class CARDLAYOUT extends Frame implements ActionListener
{
    CardLayout card = new CardLayout();

    Button b1 = new Button("previous");
    Button b2 = new Button("Next");
    Button b3 = new Button("Last");

    CARDLAYOUT()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(card);
        add(b1,"Card1");
        add(b2,"Card2");
        add(b3,"Card3");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        card.next(this);
    }

    public static void main(String args[])
    {
        CARDLAYOUT c = new CARDLAYOUT();
    }
}