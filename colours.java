import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class colours extends JFrame implements ActionListener
{
JFrame f=new JFrame("welcome to menu program");
JMenu m1;
JMenuBar b1;
JMenuItem g,b,r,y,cl;
JLabel l1;
Container c;
colours()
{
c=f.getContentPane();
c.setLayout(null);
f.setSize(500,500);
f.setLayout(null);
l1=new JLabel("hello friends:)");
l1.setFont(new Font("Arial",Font.BOLD,30));
l1.setBounds(100,100,400,40);
f.add(l1);
m1=new JMenu("set colours");
b1=new JMenuBar();

g=new JMenuItem("green");
r=new JMenuItem("red");
b=new JMenuItem("blue");
y=new JMenuItem("yellow");
cl=new JMenuItem("clear screen");
m1.add(g);
m1.add(r);
m1.add(b);
m1.add(y);
m1.add(cl);
g.addActionListener(this);
r.addActionListener(this);
b.addActionListener(this);
y.addActionListener(this);
cl.addActionListener(this);
b1.add(m1);
f.setJMenuBar(b1);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==g)
{
c.setBackground(Color.GREEN);
l1.setForeground(Color.YELLOW);
}
if(e.getSource()==r)
{
c.setBackground(Color.RED);
l1.setForeground(Color.BLUE);
}
if(e.getSource()==b)
{
c.setBackground(Color.BLUE);
l1.setForeground(Color.PINK);
}
if(e.getSource()==y)
{
c.setBackground(Color.YELLOW);
l1.setForeground(Color.GREEN);
}
if(e.getSource()==cl)
{
c.setBackground(Color.WHITE);
l1.setForeground(Color.BLACK);
}
}
public static void main(String s[])
{
new colours();
}
}

