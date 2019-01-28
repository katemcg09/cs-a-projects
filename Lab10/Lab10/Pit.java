
import java.awt.*;
import java.applet.*;

public class Pit
{
    int diam;
    public Pit(int size){
        diam = size;
    }
    
    public void drawPit(Graphics g){
        g.setColor(new Color(171, 112, 53));
        g.fillOval(499,225,diam,diam);
    }
}
