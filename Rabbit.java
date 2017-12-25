import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Rabbit extends ClassAnimal  {
	public Rabbit (int maxSpeed, int maxCountFood, float weight, Color color){
		this.colorBody = color;
		this.setWeight(weight);
		this.setMaxCountFood(countFood);
		this.maxSpeed = maxSpeed;
		
		Random r = new Random();
		this.posX = (r.nextInt(190) +10);
		this.posY = (r.nextInt(190) +10);		
	}
	
	@Override
	public void moveAnimal() {
		posX +=
				(maxSpeed * 50 / weight) / 
				(countFood == 0 ? 1 : countFood);		
	}
	
	@Override
	public void drawAnimal(Graphics g) {
		drawLightAnimal(g);	
	}
	
	protected void drawLightAnimal(Graphics g) {
		g.setColor(Color.DARK_GRAY);
         for (int i=0, a=0 ; i<10; i++, a++)
         {
             g.drawLine( posX + 25+a, posY + 25, posX + 25+a, posY + 60);
         }
         for (int i = 0, a = 0; i < 15; i++, a++)
         {
             g.drawLine( posX + 50 + a, posY + 25, posX + 80 + a, posY + 56);
         }
         for (int i = 0, a = 0; i < 15; i++, a++)
         {
             g.drawLine( posX + 80 + a, posY + 56, posX + 60 + a, posY + 63);
         }
         g.setColor(Color.BLACK);
         g.drawLine( posX + 50, posY + 25, posX + 80, posY + 56);//лапы
         g.drawLine( posX + 65, posY + 25, posX + 95, posY + 56);
         g.drawLine( posX + 80, posY + 56, posX +60, posY + 63);
         g.drawLine( posX + 95, posY + 56, posX + 75, posY + 63);
         g.drawLine( posX + 25, posY + 25, posX + 25, posY + 63);
         g.drawLine( posX + 35, posY + 25, posX + 35, posY + 63);
         g.fillOval( posX + 58, posY + 57, 20, 10);
         g.drawOval( posX + 58, posY + 57, 20, 10);
         g.fillOval( posX + 15, posY + 57, 20, 10);
         g.drawOval( posX + 15, posY + 57,20 ,10 );
         g.setColor(colorBody);
         g.fillOval( posX + 14, posY + 6, 40, 20);// тело
         g.setColor(Color.BLACK);
         g.drawOval( posX + 14, posY + 6, 40, 20);
         g.setColor(colorBody);
         g.fillOval( posX + 18, posY + 11, 40, 25);
         g.setColor(Color.BLACK);
         g.drawOval( posX + 18, posY + 11, 40, 25);
         g.setColor(colorBody);
         g.fillOval( posX + 25, posY + 10, 70, 40);
         g.setColor(Color.BLACK);
         g.drawOval( posX + 25, posY + 10, 70, 40);
         g.setColor(colorBody);
         g.fillOval( posX + 60, posY + 33, 25, 20);//задние лапы
         g.setColor(Color.BLACK);
         g.drawOval( posX + 60, posY + 33, 25, 20);
         g.setColor(colorBody);
         g.fillOval(posX, posY, 33,20 );//голова
         g.setColor(Color.BLACK);
         g.drawOval( posX, posY, 33, 20);            
         g.setColor(colorBody);
         g.fillOval( posX + 18, posY-21, 10, 25); // уши
         g.setColor(Color.BLACK);
         g.drawOval( posX + 18, posY-21, 10, 25);
         g.setColor(Color.BLACK);
         g.drawOval( posX+7, posY+7, 3, 3); //глаза
	}
		
	protected void setMaxCountFood(int value) {
		if(value>1 && value<15) {
			super.maxCountFood = value;
		} else {
			super.maxCountFood = 10;
		}
	}	
	protected void setWeight(float value){
		if(value>1 && value<10) {
			super.weight = value;
		} else {
			super.weight = 5;
		}
	}
}
