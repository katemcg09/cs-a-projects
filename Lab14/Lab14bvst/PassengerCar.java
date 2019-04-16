// PassengerCar.java
// 02-24-15 by Leon Schram
// This is one of the student starting files
// of the Lab14b lab assignment.


import java.awt.*;


class PassengerCar extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public PassengerCar(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }
   public void setX(int x){
        super.setX(x);
           xPos = x;
    }
	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawWindows(g);
      drawRoof(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+10,yPos+30,25,30);
       g.fillRect(xPos+45,yPos+30,25,30);
	    g.fillRect(xPos+80,yPos+30,25,30);
       g.fillRect(xPos+115,yPos+30,25,30);
	}
   
   private void drawRoof(Graphics g)
   {
      Polygon roof = new Polygon();
      roof.addPoint(xPos-15,yPos+20);
      roof.addPoint(xPos,yPos);
      roof.addPoint(xPos+150,yPos);
      roof.addPoint(xPos+165,yPos+20);
      g.setColor(carColor);
      g.fillPolygon(roof);
   }   
}
	