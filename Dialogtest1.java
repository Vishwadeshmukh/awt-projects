import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dialogtest1 extends JFrame implements ActionListener
{
JFrame f=new JFrame("welcome");
JButton b1,b2,b3,b4,b5,b6,b7;
Container c;
Dialogtest1()
{
c=f.getContentPane();
c.setLayout(null);
f.setSize(800,800);
f.setVisible(true);
f.setLayout(null);
b1=new JButton("confirmbx");
b1.setBounds(100,50,100,20);
b1.addActionListener(this);
c.add(b1);
b2=new JButton("inputbox");
b2.setBounds(100,100,100,20);
b2.addActionListener(this);
c.add(b2);
b3=new JButton("plain");
b3.setBounds(100,150,100,20);
b3.addActionListener(this);
c.add(b3);
b4=new JButton("information");
b4.setBounds(100,200,100,20);
b4.addActionListener(this);
c.add(b4);
b5=new JButton("question");
b5.setBounds(100,250,100,20);
b5.addActionListener(this);
c.add(b5);
b6=new JButton("error");
b6.setBounds(100,300,100,20);
b6.addActionListener(this);
c.add(b6);
b7=new JButton("warning");
b7.setBounds(100,350,100,20);
b7.addActionListener(this);
c.add(b7);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int i=JOptionPane.showConfirmDialog(c,"save changes YES/NO/Cancel","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
}
if(e.getSource()==b2)
{
String s1=JOptionPane.showInputDialog("enter your name");
}
if(e.getSource()==b3)
{
JOptionPane.showMessageDialog(c,"global","Plain Message",JOptionPane.PLAIN_MESSAGE);
}
if(e.getSource()==b4)
{
JOptionPane.showMessageDialog(c,"global","Information Message",JOptionPane.INFORMATION_MESSAGE);
}
if(e.getSource()==b5)
{
JOptionPane.showMessageDialog(c,"global","Question Message",JOptionPane.QUESTION_MESSAGE);
}
if(e.getSource()==b6)
{
JOptionPane.showMessageDialog(c,"global","Error Message",JOptionPane.ERROR_MESSAGE);
}
if(e.getSource()==b7)
{
JOptionPane.showMessageDialog(c,"global","Warning Message",JOptionPane.WARNING_MESSAGE);
}
}
public static void main(String s[])
{
new Dialogtest1();
}
}