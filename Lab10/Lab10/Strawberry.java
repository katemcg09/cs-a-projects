import java.awt.*;
import java.applet.*;

public class Strawberry extends Fruit
{
    Seeds seeds;
    Leaves leaves;
    public Strawberry(String cat, String type){
        super (cat, type);
        seeds = new Seeds (204, 219, 107);
        leaves = new Leaves (35, 117, 32);
    }
    public void drawBerry (Graphics g){
        g.setColor(new Color (235,69,69));
        Polygon triangle = new Polygon();
        triangle.addPoint(75,150);
        triangle.addPoint(212,450);
        triangle.addPoint(350,150);
        g.fillPolygon(triangle);
        seeds.drawSeeds(g);
        leaves.drawLeaves(g);
        
    }
}
