import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class dialog extends JDialog implements ActionListener
{
JFrame f=new JFrame("welcome");
JDialog d1;
JButton b1;
Container c1;
dialog()
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
d1=new JDialog(f,"Dialog 1");
d1.setSize(200,200);
d1.setVisible(true);
}
public static void main(String s[])
{
new dialog();
}
}