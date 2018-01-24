package labs;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ShowAnimal  extends JPanel{	
	private IAnimals animal;	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(animal!=null) {
			animal.setPosition(22, 150);
			animal.drawAnimal(g);
		}
	}
	public void setAnimal(IAnimals animal) {
		this.animal = animal;
	}
}
