
/**
 * Train.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */ 

import java.awt.*;
import java.util.ArrayList;
public class Train
{
    private int x;
    private int y;
    ArrayList<RailCar> train;
    public Train(int x, int y){
        this.x = x;
        this.y = y;
        train = new ArrayList<RailCar>();
    }
    public void addCar(String name, Color color){
        if (name.equals("Locomotive")){
            train.add(new Locomotive(color,x,y));
        }
        else if(name.equals("FreightCar")){
            train.add(new FreightCar(color,x,y));
        }
        else if(name.equals("PassengerCar")){
            train.add(new PassengerCar(color,x,y));
        }
        else if(name.equals("Caboose")){
            train.add(new Caboose(color,x,y));
        }
        
    }
    
    public void addCar(int ind, String name, Color color){
        
        if (name.equals("Locomotive")){
            train.add(ind, new Locomotive(color,x,y));
        }
        else if(name.equals("FreightCar")){
            train.add(ind, new FreightCar(color,x,y));
        }
        
        else if(name.equals("PassengerCar")){
            train.add(ind, new PassengerCar(color,x,y));
        }
        else if(name.equals("Caboose")){
            train.add(ind, new Caboose(color,x,y));
        }
    }
    
    public void showCars(Graphics g){
        
        
        for (int i=0; i<=train.size(); i++){
            if (i == 0)
            train.get(i).drawCar(g);
            else{
            train.get(i).setX(x+=175);
            train.get(i).drawCar(g);
        }
        }
        
        }
    }

