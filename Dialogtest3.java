import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter.*;
import javax.swing.JOptionPane;
class Dialogtest3 extends JFrame implements ActionListener
{
JFrame f=new JFrame("welcome");
JLabel l1,l2,l3,l4,msg;
JTextField t1,t2;
JComboBox  d,m,y;
JRadioButton r1,r2;
JCheckBox terms;
JTextArea screen;
Container c;
JButton submit;
Dialogtest3()
{
c=f.getContentPane();
f.setSize(700,700);
f.setLayout(null);


l1=new JLabel("name");
l1.setBounds(100,50,100,20);
c.add(l1);
l2=new JLabel("address");
l2.setBounds(100,100,100,20);
c.add(l2);
l3=new JLabel("gender");
l3.setBounds(100,150,100,20);
c.add(l3);
l4=new JLabel("DOB");
l4.setBounds(100,200,100,20);
c.add(l4);
msg=new JLabel(" ");
msg.setBounds(100,250,300,20);
c.add(msg);
t1=new JTextField();
t1.setBounds(250,50,100,20);
c.add(t1);
t2=new JTextField();
t2.setBounds(250,100,100,20);
c.add(t2);
String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String month[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
String year[]={"2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002"};
d= new JComboBox(day);
d.setBounds(250,200,50,20);
m=new JComboBox(month);
m.setBounds(310,200,50,20);
y=new JComboBox(year);
y.setBounds(370,200,50,20);
c.add(d);
c.add(m);
c.add(y);
r1=new JRadioButton("male");
r2=new JRadioButton("female");
r1.setBounds(250,150,100,20);
r2.setBounds(250,180,100,20);
r1.setSelected(true);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
c.add(r1);
c.add(r2);
terms=new JCheckBox("please accept all terms and conditions");
terms.setBounds(100,300,300,30);
c.add(terms);
submit=new JButton("submit");
submit.setBounds(250,350,100,20);
c.add(submit);
submit.addActionListener(this);
screen=new JTextArea();
screen.setBounds(450,50,300,300);
c.add(screen);
f.addWindowListener(new WindowAdapter(){

public void windowClosing(WindowEvent e)
{
int resp=JOptionPane.showConfirmDialog(f,"are you sure you want to exit?","Exit?",JOptionPane.YES_NO_OPTION);
if(resp==JOptionPane.YES_OPTION)
{
System.exit(0);
}
else
{
f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
}
}
});

f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(terms.isSelected())
{
msg.setText("Registation is successful");
String name=t1.getText();
String gender="male";
if(r2.isSelected())
{
gender="female";
}
String dob=d.getSelectedItem()+"-"+m.getSelectedItem()+"-"+y.getSelectedItem();
String add=t2.getText();
screen.setText("name:"+name+"\n"+"address:"+add+"\n"+"gender:"+gender+"\n"+"DOB:"+dob);
}
else
{
msg.setText("Accept terms and condtions");
screen.setText("");
}
}





public static void main(String s[])
{
new Dialogtest3();
}
}
