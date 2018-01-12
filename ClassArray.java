public class ClassArray<T> {
	private T[] places;
	private T defaultValue;
	
	public ClassArray(int size, T defaultValue) {
		this.defaultValue = defaultValue;
		places = (T[])(new Object[size]);
		for(int i = 0;i<places.length;i++) {
			places[i] = defaultValue;
		}
	}
	
	public int addAnimal(T ship) {
		for(int i = 0;i<places.length;i++) {
			if(checkFreePlace(i)) {
				places[i] = ship;
				return i;
			}
		}
		return -1;
	}
	
	public T getAnimal(int index) {
		if(!checkFreePlace(index)) {
			T ship = places[index];
			places[index] = defaultValue;
			return ship;
		}
		return defaultValue;
	}
	
	public T popAnimal(int index) {
		if(!checkFreePlace(index)) {
			return places[index];
		}
		return defaultValue;
	}
	
	private boolean checkFreePlace(int index) {
		if(index < 0 || index > places.length) {
			return false;
		}
		if(places[index] == null) {
			return true;
		}
		if(places[index].equals(defaultValue)) {
			return true;
		}
		return false;
	}
}
