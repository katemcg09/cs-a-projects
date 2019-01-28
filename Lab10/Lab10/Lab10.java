import java.awt.*;
import java.applet.*;
//Avina and Kate did this
public class Lab10 extends Applet {
    public void paint (Graphics g) {
        Strawberry berry = new Strawberry ("fruit", "berry");
        berry.drawBerry(g);
        Avocado avo = new Avocado ("fruit", "Stone Fruit");
        avo.drawAvo(g);
    }
}
