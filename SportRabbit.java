import java.awt.Color;
import java.awt.Graphics;

public class SportRabbit extends Rabbit {
	  private Color dopColor;
      boolean hidely;      
      
      public SportRabbit(int maxSpeed, int maxCountFood, float weight, Color color, boolean hidely, Color dopColor){
    	  super(maxSpeed, maxCountFood, weight, color);
    	  this.hidely = hidely;
    	  this.dopColor = dopColor;
      }
      
      @Override
  	protected void drawLightAnimal(Graphics g) {
    	

    	g.setColor(dopColor);
        g.fillOval( posX + 86, posY + 37, 14, 10);
        g.setColor(Color.BLACK);
        g.drawOval(posX + 86, posY + 37, 14, 10);
    	  
  		super.drawLightAnimal(g);
  		
  		
  		g.setColor(Color.WHITE);
        if (hidely)
        {
            g.fillOval(posX + 18, posY + 4, 10, -25); 
            g.drawOval(posX + 18, posY + 4, 10, -25);
        }


        if (hidely)
        {
        	g.setColor(colorBody);
            g.fillOval(posX + 18, posY - 3, 40, 10);
            g.setColor(Color.BLACK);
            g.drawOval(posX + 18, posY - 3, 40, 10);
        }
        else
        {
        	g.setColor(colorBody);
            g.fillOval(posX + 18, posY + 5, 10, -40);
            g.setColor(Color.BLACK);
            g.drawOval(posX + 18, posY + 5, 10, -40);
        }
 
        g.setColor(dopColor);
        g.fillOval(posX + 6, posY + 6, 5, 5);

        
        g.setColor(colorBody);
        g.fillOval(posX + 55, posY + 30, 30, 24);
        g.setColor(Color.BLACK);
        g.drawOval(posX + 55, posY + 30, 30, 24);
  		
      }
}


/*
 package labs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class UltaMegaBuffSuperMotorShip extends MotorShip {
	
	private boolean pipe;
	private boolean boat;
	private Color dopColor;
	public UltaMegaBuffSuperMotorShip(int maxSpeed, int maxCountPassengers,
			float weight, Color color,boolean pipe,boolean boat,Color dopColor) {
		super(maxSpeed, maxCountPassengers, weight, color);
		this.pipe = pipe;
		this.boat = boat;
		this.dopColor = dopColor;
	}
	
	@Override
	protected void drawMotorShip(Graphics g) {
		super.drawMotorShip(g);
		Polygon points = new Polygon();
        g.setColor(dopColor);
        if (pipe) {
            points.addPoint(posX + 25, posY - 40);
            points.addPoint(posX + 25, posY - 45);
            points.addPoint(posX + 55, posY - 45);
            points.addPoint(posX + 55, posY - 40);
            points.addPoint(posX + 25, posY - 40);
            g.drawPolygon(points);
        }
        if (boat) {
            points = new Polygon();
            points.addPoint(posX+15, posY+7);
            points.addPoint(posX + 45, posY+7);
            points.addPoint(posX + 50, posY+2);
            points.addPoint(posX + 65, posY+2);
            points.addPoint(posX + 55, posY + 17);
            points.addPoint(posX + 20, posY + 17);
            points.addPoint(posX+15, posY+7);
            g.drawPolygon(points);
        }
	}

}
 
 */
