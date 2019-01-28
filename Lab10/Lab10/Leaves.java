import java.awt.*;
import java.applet.*;

public class Leaves
{
    int r; 
    int gr;
    int b;
    public Leaves (int red, int green, int blue){
        r = red;
        gr = green;
        b = blue;
    } 
    
    public void drawLeaves (Graphics g){
        g.setColor(new Color(r,gr,b));
        g.fillOval(182,30,60,120);
        g.fillOval(93,120,120,55);
        g.fillOval(212,120,120,55);
    }
}
