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
//		 Pen pen = new Pen(Color.Tan);
//         Brush br = new SolidBrush(Color.Tan);
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

       //  pen = new Pen(Color.Black);
         g.setColor(Color.BLACK);
         g.drawLine( posX + 50, posY + 25, posX + 80, posY + 56);
         g.drawLine( posX + 65, posY + 25, posX + 95, posY + 56);
         g.drawLine( posX + 80, posY + 56, posX +60, posY + 63);
         g.drawLine( posX + 95, posY + 56, posX + 75, posY + 63);
         g.drawLine( posX + 25, posY + 25, posX + 25, posY + 63);
         g.drawLine( posX + 35, posY + 25, posX + 35, posY + 63);
         g.fillOval( posX + 58, posY + 57, 20, 10);
         g.drawOval( posX + 58, posY + 57, 20, 10);
         g.fillOval( posX + 15, posY + 57, 20, 10);
         g.drawOval( posX + 15, posY + 57,20 ,10 );
//         pen = new Pen(Color.Black);
//         br = new SolidBrush(ColorBody);
         g.setColor(colorBody);
         g.fillOval( posX + 14, posY + 6, 40, 20);
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
         g.fillOval( posX + 60, posY + 33, 25, 20);
         g.setColor(Color.BLACK);
         g.drawOval( posX + 60, posY + 33, 25, 20);

         g.setColor(colorBody);
         g.fillOval(posX, posY, 33,20 );
         g.setColor(Color.BLACK);
         g.drawOval( posX, posY, 33, 20);
         
         g.setColor(colorBody);
         g.fillOval( posX + 18, posY+4, 10, -25); 
         g.setColor(Color.BLACK);
         g.drawOval( posX + 18, posY+4, 10, -25);

         g.drawOval( posX+7, posY+7, 3, 3);
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

/*
 * package labs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class MotorShip extends Ship{
	
	public MotorShip(int maxSpeed,int maxCountPassengers, float weight,Color color) {
		this.colorBody = color;
		this.setWeight(weight);
		this.setMaxCountPassengers(maxCountPassengers);
		this.maxSpeed = maxSpeed;
		
		Random r = new Random();
		this.posX = (r.nextInt(190) +10);
		this.posY = (r.nextInt(190) +10);
		
	}

	@Override
	public void moveCar() {
		posX +=
				(maxSpeed * 50 / weight) / 
				(countPassengers == 0 ? 1 : countPassengers);
		
	}

	@Override
	public void drawCar(Graphics g) {
		drawMotorShip(g);
		
	}
	
	protected void drawMotorShip(Graphics g) {
		g.setColor(Color.BLACK);
        Polygon points = new Polygon();
        points.addPoint(posX, posY);
        points.addPoint(posX + 60, posY);
        points.addPoint(posX + 70, posY - 10);
        points.addPoint(posX + 100, posY - 10);
        points.addPoint(posX + 80, posY + 20);
        points.addPoint(posX + 10, posY + 20);
        points.addPoint(posX, posY);
        g.drawPolygon(points);
        points = new Polygon();
        points.addPoint(posX + 10, posY);
        points.addPoint(posX + 10, posY - 20);
        points.addPoint(posX + 20, posY - 20);
        points.addPoint(posX + 20, posY - 30);
        points.addPoint(posX + 30, posY - 30);
        points.addPoint(posX + 30, posY - 50);
        points.addPoint(posX + 50, posY - 50);
        points.addPoint(posX + 50, posY - 30);
        points.addPoint(posX + 70, posY - 30);
        points.addPoint(posX + 70, posY - 20);
        points.addPoint(posX + 80, posY - 20);
        points.addPoint(posX + 80, posY - 10);
        points.addPoint(posX + 70, posY - 10);
        points.addPoint(posX + 60, posY);
        points.addPoint(posX + 10, posY);
        g.drawPolygon(points);
        g.drawLine(posX + 10, posY - 20, posX + 70, posY - 20);
        g.drawLine(posX + 20, posY - 30, posX + 60, posY - 30);
        g.drawLine(posX + 30, posY - 45, posX + 50, posY - 45);
        g.setColor(colorBody);
        g.drawRect(posX + 20, posY - 15, 10, 10);
        g.drawRect(posX + 30, posY - 15, 10, 10);
        g.drawRect(posX + 70, posY, 10, 10);
        for(int i = 0; i < 5; i++)
        {
            g.drawOval(posX + 22 + (10 * i), posY - 27, 5, 5);
        }
		
	}

	protected void setMaxCountPassengers(int value) {
		if(value>0 && value<5) {
			super.maxCountPassengers = value;
		} else {
			super.maxCountPassengers = value;
		}
	}
	
	protected void setWeight(float value){
		if(value>500 && value<1500) {
			super.weight = value;
		} else {
			super.weight = 1000;
		}
	}

}

 */
