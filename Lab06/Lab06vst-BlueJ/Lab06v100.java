// Lab06v100.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v100 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        // Draw Random Lines
        for (int k = 0; k<100; k++){
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red, green, blue));
            g.drawLine((int)(Math.random()*391)+10,(int)(Math.random()*291)+10,(int)(Math.random()*391)+10,(int)(Math.random()*291)+10);
          }
        // Draw Random Squares
        for (int k = 0; k<100; k++){
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red, green, blue));
            g.fillRect((int)(Math.random()*341)+400,(int)(Math.random()*241)+10,50,50);;
        }
        // Draw Random Circles
        for (int k = 0; k<100; k++){
            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            g.setColor(new Color(red, green, blue));
            int diameter = (int)(Math.random()*201);
            g.drawOval((int)(Math.random()*(391-diameter))+10,(int)(Math.random()*(291-diameter))+300,diameter,diameter);
          }
        // Draw 3-D Box
        Polygon triangle = new Polygon();
        g.setColor(Color.blue);
        triangle.addPoint(625,375);
        triangle.addPoint(625,425);
        triangle.addPoint(675,425);
        g.fillPolygon(triangle);
        Polygon trapezoid = new Polygon();
        g.setColor(Color.yellow);
        trapezoid.addPoint(525,375);
        trapezoid.addPoint(625,375);
        trapezoid.addPoint(625,425);
        trapezoid.addPoint(575,425);
        g.fillPolygon(trapezoid);
        Polygon rhombus = new Polygon();
        g.setColor(Color.green);
        rhombus.addPoint(525,375);
        rhombus.addPoint(525,475);
        rhombus.addPoint(575,525);
        rhombus.addPoint(575,425);
        g.fillPolygon(rhombus);
        Polygon square = new Polygon();
        g.setColor(Color.red);
        square.addPoint(575,425);
        square.addPoint(575,525);
        square.addPoint(675,525);
        square.addPoint(675,425);
        g.fillPolygon(square);
    
    }
        
}



    
 