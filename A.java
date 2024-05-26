import java.awt.*;
import java.awt.event.*;

public class A extends Frame implements ActionListener
{
TextField t1;
TextField t2;
Button b1;
Button b2;
Label l1;
A()
{
t1=new TextField();
setBounds(250,100,100,30);

l1=new Label("string");
l1.setBounds(100,100,100,30);
add(l1);
add(t1);
 b1=new Button("reverse");
b1.setBounds(100,250,100,30);
b1.addActionListener(this);
 b2=new Button("enter string");
b2.setBounds(250,250,100,30);
b2.addActionListener(this);
add(b1);
add(b2);
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{

}
}
public static void main(String s[])
{
A obj=new A();
}
}