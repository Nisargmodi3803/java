import java.awt.*;
import java.awt.event.*;

public class panel extends Frame
{
    Panel pan = new Panel();
    Button b1 = new Button("Button 1");
    Button b2 = new Button("Button 2");

    panel()
    {
        setSize(500,500);
        setVisible(true);
        pan.setBounds(100,100,200,200);
        pan.setBackground(Color.green);
        b1.setBackground(Color.red);
        b2.setBackground(Color.yellow);
        pan.add(b1);
        pan.add(b2);
        add(pan);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) 
    {
        panel p =new panel();
    }
}
