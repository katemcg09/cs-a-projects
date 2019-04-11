// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
    private int x;
    private int y; 
    private int xT;
    private int yT;
   public Shape3Octagon (int x, int y, int xT, int yT){
       this.x = x;
       this.y = y;
       this.xT = xT;
       this.yT = yT;
    }
    
    public void drawShape(Graphics g)
   {
       Polygon p = new Polygon();
       p.addPoint(220,400);
       p.addPoint(240,400);
       p.addPoint(260,420);
       p.addPoint(260, 440);
       p.addPoint(240, 460);
       p.addPoint(220, 460);
       p.addPoint(200, 440);
       p.addPoint(200, 420);
       g.fillPolygon(p);
   }
   
   public void displayName(Graphics g){
    g.drawString("Octagon", xT, yT);
    }
    
    public  void displayNumSides(Graphics g){
    g.drawString("An octagon has 8 sides.", x, y);
    }
}

