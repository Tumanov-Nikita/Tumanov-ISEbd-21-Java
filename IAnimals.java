import java.awt.Graphics;


public interface IAnimals {
		void moveAnimal();
		void drawAnimal(Graphics g);
		void setPosition(int x, int y);
		void hide(boolean hidely);
		void eat(int count); 	
}
