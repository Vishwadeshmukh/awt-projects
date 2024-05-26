//AWT ex1
import java.awt.*;
class example extends Frame
{
example()
{
Button b=new Button("click");
b.setBounds(100,100,150,70);
add(b);
setSize(600,600);
setLayout(null);
setTitle("my first awt program");
Label l=new Label("label 1=Frame window using extend frame class");
l.setBounds(100,300,500,50);
add(l);
setVisible(true);
}
}
class Awtex1{
public static void main(String s[]){
example e=new example();
}
}