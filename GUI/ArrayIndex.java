import java.awt.*;
import java.awt.event.*;

class Array_ extends Frame implements ActionListener
{
    Label l1 = new Label("ArrayIndex");
    Label l2 = new Label("Data");
    int []arr = new int[100];
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b = new Button("Submit");

    Array_()
    {
        setSize(500,500);
        setVisible(true);

        setLayout(new FlowLayout());

        // l1.setBounds(100,100,100,100);
        // l2.setBounds(200, 100, 100, 100);
        // t1.setBounds(100, 300, 50, 50);
        // t2.setBounds(200, 300, 50, 50);
        // b.setBounds(300, 300, 20, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        arr[0] = 10;
        for(int i=0;i<100;i++)
        {
            arr[i] = arr[i]+10;
        }

        b.addActionListener(null);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int d1 = Integer.parseInt(t1.getText());
        int d2;

        try
        {
            d2 = arr[d1];
            t2.setText(Integer.toString(d2));
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            t2.setText("ArrayIndexOutOfBound Exception");
        }
    }
}
public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        Array_ a = new Array_();
    }
}
