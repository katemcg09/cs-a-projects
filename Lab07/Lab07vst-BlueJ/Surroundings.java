
/**
 * Surroundings.java  
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
public class Surroundings
{
    public static void drawSun(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(20,20,100,100);
    }
    public static void drawClouds(Graphics g){
        g.setColor(Color.white);
        for (int k = 20; k > 0; k--){
            g.fillOval((int)(Math.random()*681),(int)(Math.random()*181),
                (int)(Math.random()*100)+20,(int)(Math.random()*100)+20);
        }
    }
    public static void drawFence(Graphics g){
        int x = 0;
        int y = 250;
        g.setColor(Color.gray);
        for (int k = 8; k > 0; k--){
            g.drawRect(x,y,100,50);
            x += 100;
            int j = x - 200;
            int l = y;
            int p = j;
            for(int i = 20; i > 0; i--){
                g.drawLine(j,l,j+100,l+50);
                j += 10;
                p = x-100;
            }
            for(int i = 20; i > 0; i--){
                g.drawLine(j,l+50,j+100,l);
                j -= 10;
                
            }
        }
        g.setColor(new Color(238,238,238));
        g.fillRect(800,0,100,600);
    }
    public static void background(Graphics g){
        g.setColor(new Color(135,206,235));
        g.fillRect(0,0,800,600);
    }
}
