import java.awt.*;
import java.awt.event.*;

class form extends Frame implements ActionListener
{
    Label l1 = new Label("Name");
    Label l2 = new Label("Address");
    Label l3 = new Label("E-Mail");
    Label l4 = new Label("Hobbies");

    TextField t1 = new TextField(45);
    TextField t2 = new TextField(45);
    TextField t3 = new TextField(45);

    Checkbox c1 = new Checkbox("Reading",false);
    Checkbox c2 = new Checkbox("Singing",false);
    Checkbox c3 = new Checkbox("Playing",false);

    Button b1 = new Button("Submit");
    Button b2 = new Button("Clear");

    form()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        setLayout(new FlowLayout(l4.LEFT));

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        b2.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(c1);
        add(c2);
        add(c3);

        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e)
    {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
}

class Registation
{
    public static void main(String args[])
    {
        form f = new form();
    }
}