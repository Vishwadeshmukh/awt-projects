import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Dialogtest2 extends JFrame implements ActionListener
{
JFrame f=new JFrame("welcome");
JLabel l1,l2,l3,l4,msg;
JTextField t1,t2,t3;
Dialogtest2()
{
Container c;
f.setSize(700,700);
f.setLayout(null);
f.setVisible(true);
l1=new JLabel("name");
l1.setBounds(100,50,100,20);
c.add(l1);
l2=new JLabel("name");
l2.setBounds(100,50,100,20);
c.add(l2);
l3=new JLabel("name");
l3.setBounds(100,50,100,20);
c.add(l3);
l4=new JLabel("name");
l4.setBounds(100,50,100,20);
c.add(l4);
msg=new JLabel("name");
msg.setBounds(100,50,100,20);
c.add(msg);



}
public static void main(String s[])
{
new Dialogtest2();
}
