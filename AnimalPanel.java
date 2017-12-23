import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


	public class AnimalPanel extends JPanel {
		private IAnimals ClassAnimal;
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			if(ClassAnimal!=null) {
				ClassAnimal.drawAnimal(g);
			}
		}
		
		public void setAnimal(IAnimals animal) {
			this.ClassAnimal = animal;
		}
		public IAnimals getAnimal() {
			return ClassAnimal;
		}
		
	
	}



/*package labs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ShipPanel extends JPanel {
	private ITransport ship;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(ship!=null) {
			ship.drawCar(g);
		}
	}
	
	public void setShip(ITransport ship) {
		this.ship = ship;
	}
	public ITransport getShip() {
		return ship;
	}
}

*/