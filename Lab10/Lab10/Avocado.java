import java.awt.*;
import java.applet.*;
public class Avocado extends Fruit
{
    Pit pit;
    public Avocado (String cat, String type){
        super (cat, type); 
        pit = new Pit (178);
    }
    
    public void drawAvo(Graphics g){
        g.setColor(new Color(100, 56, 12));
        g.fillOval(450, 50, 275, 500);
        g.setColor(new Color(172,236,98));
        g.fillOval(454, 54, 267, 492);
        pit.drawPit(g);
    }
    
    
}
