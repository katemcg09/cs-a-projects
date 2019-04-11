// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
    private int x;
    private int y; 
    private int xT;
    private int yT;
   public Shape1Square (int x, int y, int xT, int yT){
       this.x = x;
       this.y = y;
       this.xT = xT;
       this.yT = yT;
    }
    
    public void drawShape(Graphics g)
   {
       g.fillRect(100,50,200,200);
   }
   
   public void displayName(Graphics g){
    g.drawString("Square", xT, yT);
    }
    
     public  void displayNumSides(Graphics g){
        g.drawString("A square has 4 sides.", x, y);
        }
}

