import java.awt.*;
import java.applet.*;
/*<applet code="Awt2" width=500  height=500></applet>
*/
public class Awt2 extends Applet
{
public void init()
{
Label first=new Label("first");
Label second=new Label("second");
Label third=new Label("third");
add(first);
add(second);
add(third);
Button b1=new Button("start");
b1.setBounds(10,50,100,30);
add(b1);

}
}
