import java.util.HashMap;



public class ClassArray<T extends IAnimals> {
	private HashMap<Integer,T> places;
	private int maxCount;
	private T defaultValue;
	
	public ClassArray(int size, T defaultValue) {
		this.defaultValue = defaultValue;
		places = new HashMap();
		this.maxCount = size;
	}
	
	public int addAnimal(T animal) {
		for(int i = 0;i<maxCount;i++) {
			if(checkFreePlace(i)) {
				places.put(i, animal);
				return i;
			}
		}
		return -1;
	}
	
	public T getAnimal(int index) {
		if(!checkFreePlace(index)) {
			T animal = places.get(index);
			places.remove(index);
			return animal;
		}
		return defaultValue;
	}
	
	public T popAnimal(int index) {
		if(!checkFreePlace(index)) {
			return places.get(index);
		}
		return defaultValue;
	}
	
	private boolean checkFreePlace(int index) {
		return !places.containsKey(index);
	}
}
