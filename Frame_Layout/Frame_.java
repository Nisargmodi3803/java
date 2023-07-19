import java.awt.*;

// public class Frame_ extends Frame
// {
//     Frame_()
//     {
//         setSize(500,500);
//         setVisible(true);
//     }
//     public static void main(String[] args) 
//     {
//         Frame_ f = new Frame_();
//     }
// }

public class Frame_
{
    public Frame f = new Frame("Hello");

    Frame_()
    {
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        Frame_ f = new Frame_();
    }
}
