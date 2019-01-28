import java.awt.*;
import java.applet.*;

public class Seeds
{
    int r;
    int gr;
    int b;
    public Seeds (int red, int green, int blue){
        r = red;
        gr = green;
        b = blue;
    }
     // 27.6
    public void drawSeeds(Graphics g){
        g.setColor(new Color(r,gr,b));
        int x;
        int y;
        for (int i = 0; i < 50; i ++){
            x = (int)(Math.random()*219) +103;
            y = (int)(Math.random()*60) +150; 
            g.drawLine( x, y, x, y+2);
        }
        for (int i = 0; i < 50; i ++){
            x = (int)(Math.random()*163) +131;
            y = (int)(Math.random()*60) +210;
            g.drawLine(x, y, x, y+2);
        }
        for (int i = 0; i < 50; i ++){
            x = (int)(Math.random()*107) +159;
            y = (int)(Math.random()*60)+270;
            g.drawLine(x, y , x, y+2);
        }
        for (int i = 0; i < 20; i ++){
            g.drawLine(x = (int)(Math.random()*51) +187, y = (int)(Math.random()*60)+330 , x, y+2);
        }
        for (int i = 0; i < 10; i ++){
            g.drawLine(x = (int)(Math.random()*5) +212, y = (int)(Math.random()*50)+390 , x, y+2);
        }
    }
}
