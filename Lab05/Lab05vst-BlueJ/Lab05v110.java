// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v110 extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        for (int k = 0; k < 50; k ++)
        {
            g.drawLine(x1,y1,x2,y2);
            x1 += 20;
            y2 -= 12;
          }
        x1 = 10;
        y2 = 640 - 630;
        for (int k = 0; k < 50; k ++)
        {
            g.drawLine(x1,y1-630,x2,y2);
            x1 += 20;
            y2 += 12;
          }
        x1 = 10;
        y2 = 10;
        for (int k = 0; k < 50; k++)
        {
            g.drawLine(x1,y1,x2-980,y2+30);
            x1 += 20;
            y2 += 12;
        }
        x1 = 10;
        y2 = 640;
        for (int k = 0; k < 50; k++)
        {
            g.drawLine(x1,y1-630,x2-980,y2-30);
            x1 += 20;
            y2 -= 12;
        }
        g.drawRect(250,168,512,315);
        x1 = 250;
        x2 = 762;
        y1 = 483;
        y2 = 483;
        for (int k = 0; k < 50; k ++)
        {
            g.drawLine(x1+10,y1,x2,y2);
            x1 += 10;
            y2 -= 6;
          }
        x1 = 250;
        y2 = 168;
        for (int k = 0; k < 50; k ++)
        {
            g.drawLine(x1+10,y1-315,x2,y2);
            x1 += 10;
            y2 += 6;
          }
        x1 = 250;
        y2 = 168;
        
        for (int k = 0; k < 50; k++)
        {
            g.drawLine(x1,y1,x2-512,y2+10);
            x1 += 10;
            y2 += 6;
        }
        x1 = 250;
        y2 = 483;
        for (int k = 0; k < 50; k++)
        {
            g.drawLine(x1,y1-315,x2-512,y2-10);
            x1 += 10;
            y2 -= 6;
        }
        
}
}

