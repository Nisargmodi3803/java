import java.awt.*;
import java.awt.event.*;




class list extends Frame implements ActionListener
{
    List l = new List(3);
    Button b = new Button("SHOW");
    Graphics g = getGraphics();
    TextField t = new TextField(9);

    list()
    {
        setSize(500,500);
        setVisible(true);
        // setLayout(null);
        // l.setBounds(200,200,150,100);
        setLayout(new FlowLayout());
        add(b);
        add(l);
        l.add("pencil");
        l.add("pen");
        l.add("scale");
        add(t);
       

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = l.getItem(l.getSelectedIndex());
        
        t.setText(s);
    }

    public static void main(String args[])
    {
        list lt = new list();
    }
}