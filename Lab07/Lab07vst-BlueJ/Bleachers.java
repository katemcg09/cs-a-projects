
/**
 * Bleachers.java  
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
public class Bleachers
{
    public static void drawSeats(Graphics g){
        g.fillRect(160,150,480,150);
        int x = 160;
        int y = 150+10;
        for (int k = 12; k > 0; k--){
            g.setColor(Color.gray);
            g.drawLine(x,y,x+480,y);
            y+=10;
        }
    }
    public static void drawSpirit(Graphics g){
        g.setColor(Color.red);
        g.fillRect(180,270,100,30);
        g.setColor(Color.blue);
        g.drawString("GO", 183, 283);
        g.drawString("PANTHERS", 185, 295);
        g.setColor(Color.red);
        g.fillRect(380,270,100,30);
        g.setColor(Color.white);
        g.drawString("GO", 393, 283);
        g.drawString("FIGHT",423, 283);
        g.drawString("WIN", 405, 295);
    }
    public static void drawAnnouncer(Graphics g){
        //the box says GLORIA H. SNYDER
        g.setColor(new Color(238,238,238));
        g.fillRect(320,75,160,75);
        g.setColor(Color.gray);
        g.drawRect(320,75,160,75);
        g.fillRect(330,100,140,30);
        g.drawString("GLORIA H. SNYDER", 340, 95);
    }
}
