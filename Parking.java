package labs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class Parking {
	ArrayList<ClassArray<IAnimals>> parking;
	private int countPlaces = 15;
	private int placeSizeWidth = 210;
	private int placeSizeHeight = 120;
	private int curentLvl;
	
	public Parking(int lvls) {
		parking = new ArrayList<ClassArray<IAnimals>>();
		curentLvl = 0;
		for(int i = 0;i<lvls;i++) {
			parking.add(new ClassArray<IAnimals>(countPlaces,null));
		} 
	}
	

	
	public int putAnimalInParking(IAnimals animal) {
		return parking.get(curentLvl).addAnimal(animal);
	}
	
	public IAnimals getAnimalInParking(int place) {
		return parking.get(curentLvl).getAnimal(place);
	}
	
	public void drawAnimals(Graphics g) {
		for(int i = 0;i<countPlaces;i++) {
			IAnimals animal = parking.get(curentLvl).popAnimal(i);
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
				g.setColor(Color.BLUE);
				if(j<5) {
					g.drawString(i*5+j+1+"", i * placeSizeWidth + 45, j * placeSizeHeight + 45);
				}
				g.setColor(Color.BLACK);
			}
			g.drawLine(i*placeSizeWidth, 0, i*placeSizeWidth, 600);
		}
	}
	
	public void lvlUp() {
		if(curentLvl + 1 < parking.size()) {
			curentLvl++;
		}
	}
	
	public void lvlDown() {
		if(curentLvl > 0) {
			curentLvl--;
		}
	}

	public int getCurentLvl() {
		return curentLvl;
	}
}

