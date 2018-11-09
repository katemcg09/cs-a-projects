
/**
 * Field.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */ 
import java.applet.*;
import java.awt.*;
public class Field
{
    public static void drawField(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(140,300,520,300);
        g.setColor(Color.red);
        g.fillRect(0,300,140,300);
        g.fillRect(660,300,140,300);
    }
    public static void drawLines(Graphics g){
        g.setColor(Color.white);
        g.drawLine(140,300,140,600);
        g.drawLine(270,300,270,600);
        g.drawLine(400,300,400,600);
        g.drawLine(530,300,530,600);
        g.drawLine(660,300,660,600);
    }
}
