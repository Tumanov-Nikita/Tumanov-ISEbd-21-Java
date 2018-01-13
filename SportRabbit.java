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
  		
  		
  		
        if (hidely)
        {
        	g.setColor(new Color(240,240,240));
            g.fillOval(posX + 18, posY - 21, 10, 25); 
            g.drawOval(posX + 18, posY - 21, 10, 25);
            g.setColor(colorBody);
            g.fillOval(posX + 18, posY - 3, 40, 10);
            g.setColor(Color.BLACK);
            g.drawOval(posX + 18, posY - 3, 40, 10);
        }
        else
        {          
        	g.setColor(colorBody);
            g.fillOval(posX + 18, posY -35, 10, 40);
            g.setColor(Color.BLACK);
            g.drawOval(posX + 18, posY -35, 10, 40);  
        }
 
        g.setColor(dopColor);
        g.fillOval(posX + 6, posY + 6, 5, 5);

        
        g.setColor(colorBody);
        g.fillOval(posX + 55, posY + 30, 30, 24);
        g.setColor(Color.BLACK);
        g.drawOval(posX + 55, posY + 30, 30, 24);
  		
      }
}

