import java.awt.*;
// import java.awt.event.*;

class Menu_ extends Frame
{
    MenuBar mb1 = new MenuBar();
    MenuBar mb2 = new MenuBar();
    Menu m1 = new Menu("File");
    Menu m2 = new Menu("View");
    MenuItem i1 = new MenuItem("Save");
    MenuItem i2 = new MenuItem("Delete");
    MenuItem i3 = new MenuItem("Next");
    MenuItem i4 = new MenuItem("Open");
    MenuItem i5 = new MenuItem("close");

    Menu_()
    {
        setSize(500,500);
        setVisible(true);

        setMenuBar(mb1);
        mb1.add(m1);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);

        setMenuBar(mb2);
        mb2.add(m2);
        m2.add(i4);
        m2.add(i5);
    }

    public static void main(String args[])
    {
        Menu_ mm = new Menu_();
    }
}