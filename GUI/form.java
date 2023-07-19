import java.awt.*;

class form extends Frame
{
    Label l1 = new Label("Username");
    Label l2 = new Label("Surename");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b = new Button("Submit");

    public form()
    {
        setLayout(new FlowLayout());
        // setLayout(new GridLayout());
        setSize(400,400);
        setVisible(true);
        // setBackground(Color.yellow);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
    }

    public static void main(String args[])
    {
        form f = new form();
    }
}