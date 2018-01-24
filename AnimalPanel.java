import java.awt.Graphics;

import javax.swing.JPanel;





	public class AnimalPanel extends JPanel {
		private IAnimals animal;
		private Parking parking;
		
		
		public AnimalPanel(){
			super();
			parking = new Parking(5);
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			parking.drawMarking(g);
			if(animal!=null) {
				parking.putAnimalInParking(animal);
				animal = null;
			}
			parking.drawAnimals(g);
		}
		
		public void setAnimal(IAnimals animal) {
			this.animal = animal;
		}
		public IAnimals getAnimal(int index) {
			return parking.getAnimalInParking(index);
		}
		public void lvlUp() {
			parking.lvlUp();
		}
		
		public void lvlDown() {
			parking.lvlDown();
		}
	}
