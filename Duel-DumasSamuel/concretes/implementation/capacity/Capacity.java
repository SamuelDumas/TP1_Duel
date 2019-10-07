package implementation.capacity;

import abstracts.combattant.ICapacity;
import exceptions.capacity.IllegalCharacteristicException;
import implementation.combattant.Fighter;

public abstract class Capacity implements ICapacity {

	int characteristic;
	final static int MINIMUM_CHARACTERISTIC = 20;
	final static int MAXIMUM_CHARACTERISTIC = 100;
	
	public Capacity(int characteristic) {
		validateCharacteristic(characteristic);
		this.characteristic = characteristic;
	}
	private void validateCharacteristic(int characteristic) {
		if(characteristic < MINIMUM_CHARACTERISTIC || characteristic > MAXIMUM_CHARACTERISTIC) throw new IllegalCharacteristicException();
		
	}
	public int getCharacteristic() {
		return this.characteristic;
		
	}
	public int getPower(Fighter fighter) {
		// TODO Auto-generated method stub
		return 0;
	}
}
