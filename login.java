import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
JFrame f=new JFrame("welcome");
JLabel l1,l2;
int count =3;
JTextField t1,t3;
JPasswordField p1;
JButton b1,b2;
Container c;
login()
{
f.setSize(700,700);
f.setLayout(null);
c=f.getContentPane();
c.setLayout(null);
l1=new JLabel("username");
l1.setBounds(150,300,100,50);
c.add(l1);

l2=new JLabel("enter password");
l1.setBounds(150,400,100,50);
c.add(l2);

t3=new JTextField();
t3.setBounds(100,500,100,50);
c.add(t3);

t1=new JTextField();
t1.setBounds(250,310,100,30);
c.add(t1);


p1=new JPasswordField();
p1.setBounds(250,410,100,30);
c.add(p1);

b1=new JButton("submit");
b1.setBounds(200,470,100,30);
b1.addActionListener(this);
c.add(b1);

b2=new JButton("clear");
b2.setBounds(350,470,100,30);
b2.addActionListener(this);
c.add(b2);
f.setVisible(true);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
f.setResizable(false);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String user,pass;
user=t1.getText();
pass=p1.getText();
if(user.equals("vishwa")&&pass.equals("123"))
{
t3.setText("login successful");
}
else
{
t3.setText("username and password is invalid");
count--;
if(count==0)
{
t3.setText("3 unsuccessful attempts");
System.exit(0);
}
}
}
if(e.getSource()==b2)
{
t1.setText("");
p1.setText("");
t1.requestFocus();
}
}
public static void main(String s[])
{
new login();
}
}

