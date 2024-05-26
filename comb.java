import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class comb extends JFrame implements ActionListener
{
 JFrame f=new JFrame("welcome ");
Container c;
JComboBox c1;
JLabel l1;
JButton b1;
JTextField t1;
comb()
{

f.setSize(400,400);
f.setLayout(null);
c=f.getContentPane();
c.setLayout(null);
l1=new JLabel("select city");
l1.setBounds(50,100,100,20);

String s1[]={"sangamner","akola","pune"};
c1=new JComboBox(s1);
c1.setBounds(150,100,100,40);
c.add(c1);

c.add(l1);
b1=new JButton("uppercase");
b1.setBounds(150,190,150,20);
b1.addActionListener(this);
c.add(b1);

t1=new JTextField();
t1.setBounds(350,190,100,30);
c.add(t1);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String s2=(String)c1.getSelectedItem();
s2=s2.toUpperCase();
t1.setText(s2);
}
}
public static void main(String s[])
{
comb m=new comb();
}
}