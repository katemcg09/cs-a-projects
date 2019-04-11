// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
    private int x;
    private int y; 
    private int xT;
    private int yT;
    public Shape2Triangle (int x, int y, int xT, int yT){
        this.x = x;
        this.y = y;
        this.xT = xT;
        this.yT = yT;
    }

    public void drawShape(Graphics g)
    {
        Polygon p1 = new Polygon();
        p1.addPoint(600,100);
        p1.addPoint(550,150);
        p1.addPoint(650,150);
        g.fillPolygon(p1);
    }

    public void displayName(Graphics g){
        g.drawString("Triangle", xT, yT);
    }

    public  void displayNumSides(Graphics g){
    g.drawString("A triangle has 3 sides.", x, y);
    }
}

