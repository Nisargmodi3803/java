import java.awt.*;
// import java.awt.event.*;

class GRIDBAGLAYOUT extends Frame
{
    Label l1 = new Label("Name");
    Label l2 = new Label("Address");
    TextField t1 = new TextField();
    TextArea t2 = new TextArea(9,15);

    GRIDBAGLAYOUT()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        add(l1,gc,0,0,1,1,0,0);
        add(t1,gc,1,0,1,1,0,20);
        add(l2,gc,0,1,1,1,0,0);
        add(t2,gc,1,1,1,1,0,60);
    }

    void add(Component c,GridBagConstraints gc,int x,int y,int w,int h,int wx,int wy)
    {
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.weightx = wx;
        gc.weighty = wy;
        add(c,gc);
    }

    public static void main(String args[])
    {
        GRIDBAGLAYOUT g = new GRIDBAGLAYOUT();
    }
}