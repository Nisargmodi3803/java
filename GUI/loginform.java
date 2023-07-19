import java.awt.*;
import java.awt.event.*;


public class loginform extends Frame
{
Label l1=new Label("User name : ");//OBJECT CREATE 
Label l2=new Label("Surname : ");//OBJECT CREATE
Label l3=new Label(" ");//OBJECT CREATE
TextField t1=new TextField();//OBJECT CREATE
TextField t2=new TextField();//OBJECT CREATE
Button b=new Button("submit");//OBJECT CREATE
public loginform()
{ setLayout(new GridLayout(3,2));
setSize(400,400);
setVisible(true);
add(l1); add(t1);
add(l2);add(t2);
add(b);
}
public static void main(String s[])
{
loginform l=new loginform();
}//end of main
}//end of class loginform
