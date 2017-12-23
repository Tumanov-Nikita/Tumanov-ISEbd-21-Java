import java.awt.Graphics;


public interface IAnimals {
		void moveAnimal();
		void drawAnimal(Graphics g);
		void setPosition(int x, int y);
		void hide(boolean hidely);
		void eat(int count); 	
}

/*
 * package labs;

import java.awt.Graphics;

public interface ITransport {
	void moveCar();
	void drawCar(Graphics g);
	void setPosition(int x,int y);
	void loadPassenger(int count);
	int getPassenger();
}

 */
