import java.awt.*;
import java.awt.event.*;

class GUICalculator extends Frame implements ActionListener
{
    Label l1 = new Label("Enter Num1");
    Label l2 = new Label("Enter Num2");
    Label l3 = new Label("Result");

    TextField t1 = new TextField(9);
    TextField t2 = new TextField(9);
    TextField t3 = new TextField(9);

    Button b1 = new Button("Add");
    Button b2 = new Button("Sub");
    Button b3 = new Button("Mult");
    Button b4 = new Button("Div");

    int result;
    
    GUICalculator()
    {
        setSize(550,550);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        String s1 = t1.getText();
        String s2 = t2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        if(e.getSource() == b1)
        {
            result = a+b;
        }
        if(e.getSource() == b2)
        {
            result = a-b;
        }
        if(e.getSource() == b3)
        {
            result = a*b;
        }
        if(e.getSource() == b4)
        {
            result = a/b;
        }

        t3.setText(Integer.toString(result));
    }
}

class Cal
{
    public static void main(String args[])
    {
        GUICalculator c =new GUICalculator();
    }
}