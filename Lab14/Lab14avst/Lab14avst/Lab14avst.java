// Lab14avst.java
// Lab14a
// Student starting version

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Lab14avst extends Applet
{
    public void paint(Graphics g)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape square = new Shape1Square(175,270,30,30);
        Shape circle = new Shape4Circle(525,600,450,350);
        Shape triangle = new Shape2Triangle(525,200,450,30);
        Shape octagon = new Shape3Octagon(175,500,30,350);
        shapes.add(square);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(octagon);
        drawGrid(g);
        for (Shape i: shapes){
            i.drawShape(g);
            i.displayName(g);
            i.displayNumSides(g);
        }
    }
    
    public void drawGrid(Graphics g)
    {
        g.drawRect(10,10,800,600);
        g.drawLine(10,300,810,300);
        g.drawLine(410,10,410,610);
    }
    
}


