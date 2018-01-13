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
