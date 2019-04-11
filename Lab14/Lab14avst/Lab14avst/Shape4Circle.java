// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
    private int x;
    private int y; 
    private int xT;
    private int yT;
   public Shape4Circle (int x, int y, int xT, int yT){
       this.x = x;
       this.y = y;
       this.xT = xT;
       this.yT = yT;
    }
    
    public void drawShape(Graphics g)
   {
       g.fillOval(500, 350, 200,200);
   }  
   
   public  void displayName(Graphics g){
    g.drawString("Circle", xT, yT);
    }
     
    public  void displayNumSides(Graphics g){
    g.drawString("A circle has 0 sides.", x, y);
    }
}
