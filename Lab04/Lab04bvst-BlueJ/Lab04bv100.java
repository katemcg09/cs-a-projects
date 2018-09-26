// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bv100 extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(20,20,200,200);
        g.drawLine(20,20,70,70);
        g.drawRect(70,70,200,200);
        g.drawLine(20,220,70,270);
        g.drawLine(220,20,270,70);
        g.drawLine(220,220,270,270);

        // DRAW SPHERE
        g.drawOval(45,45,200,200);
        g.drawOval(75,45,140,200);
        g.drawOval(105,45,80,200);
        g.drawOval(135,45,20,200);
        g.drawOval(45,75,200,140);
        g.drawOval(45,105,200,80);
        g.drawOval(45,135,200,20);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(400,70,200,200);
        g.drawLine(400,170,500,270);
        g.drawLine(400,170,550,85);
        g.drawLine(550,85,500,270);
        g.drawOval(430,134,92,92);



        // DRAW APCS
        g.setColor(Color.pink);
        g.fillRect(50,300,60,100);
        g.setColor(Color.lightGray);
        g.fillRect(125,300,60,100);
        g.setColor(Color.pink);
        g.fillRect(200,300,60,100);
        g.setColor(Color.lightGray);
        g.fillRect(275,300,60,100);
        Color background = new Color (238,238,238);
        g.setColor(background);
        g.fillRect(70,320,20,20);
        g.fillRect(70,360,20,40);
        g.fillRect(145,320,20,20);
        g.fillRect(145,360,40,40);
        g.fillRect(220,320,40,60);
        g.fillRect(295,320,40,20);
        g.fillRect(275,360,40,20);


        // DRAW PACMEN FLOWER
        g.setColor(Color.yellow);
        g.fillArc(500,400,50,50,45,270);
        g.fillArc(465,365,50,50,45,-270);
        g.fillArc(430,400,50,50,135,-270);
        g.fillArc(465,435,50,50,-45,270);


    }

}


