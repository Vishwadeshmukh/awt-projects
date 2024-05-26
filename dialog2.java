import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class dialog2 extends JDialog implements ActionListener
{
JFrame f=new JFrame("welcome");
JDialog d1,d2;
JButton b1,b2;
Container c1,c2;
dialog2()
{
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
c1=f.getContentPane();
c1.setLayout(null);
b1=new JButton("click here");
b1.setBounds(100,100,100,30);
b1.addActionListener(this);
c1.add(b1);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{firstdialog();}
if(e.getSource()==b2)
{secdialog();}
}
public void firstdialog()
{


d1=new JDialog(f,"dialog 1");
d1.setVisible(true);
d1.setSize(300,300);
 c2=d1.getContentPane();
c2.setLayout(null);
d1.add(c2);
 b2=new JButton("click me");
b2.setBounds(100,100,100,30);
b2.addActionListener(this);
d1.add(b2);
}
public void secdialog()
{
d2=new JDialog(d1,"dialog 2");
d2.setVisible(true);
d2.setSize(300,300);
}
public static void main(String s[])
{
new dialog2();
}
}