import java.awt.Color;
import java.awt.Graphics;

public class Parking {
	
	ClassArray<IAnimals> parking;
	private int countPlaces = 15;
	private int placeSizeWidth = 210;
	private int placeSizeHeight = 120;
	
	public Parking() {
		parking = new ClassArray<IAnimals>(countPlaces,null);
	}
	
	public int putShipInParking(IAnimals ship) {
		return parking.addAnimal(ship);
	}
	
	public IAnimals getAnimalInParking(int place) {
		return parking.getAnimal(place);
	}
	
	public void drawAnimals(Graphics g) {
		for(int i = 0;i<countPlaces;i++) {
			IAnimals animal = parking.popAnimal(i);
			if(animal!=null) {
				animal.setPosition(5 + i / 5 * placeSizeWidth + 5, i % 5 * placeSizeHeight + 45);
				animal.drawAnimal(g);
			}
		}
	}

	public void drawMarking(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, (countPlaces / 4) * placeSizeWidth, 600);
		for(int i = 0; i < countPlaces / 5; i++) {
			for(int j = 0; j< 6;j++) {
				g.drawLine(i * placeSizeWidth, j*placeSizeHeight,
						i*placeSizeWidth + 110, j * placeSizeHeight);
			}
			g.drawLine(i*placeSizeWidth, 0, i*placeSizeWidth, 600);
		}
	}
}
