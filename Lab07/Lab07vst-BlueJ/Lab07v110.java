// Lab07v110.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab07v110 extends Applet
{
    
    public void paint(Graphics g)   
    {
       Surroundings.background(g);
       Field.drawField(g);
       Field.drawLines(g);
       Surroundings.drawSun(g);
       Surroundings.drawClouds(g);
       Surroundings.drawFence(g);
       Bleachers.drawSeats(g);
       Bleachers.drawSpirit(g);
       Bleachers.drawAnnouncer(g);
    
    }
        
}



    
 