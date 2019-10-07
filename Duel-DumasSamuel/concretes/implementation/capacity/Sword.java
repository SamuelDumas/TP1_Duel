package implementation.capacity;

import implementation.combattant.Fighter;

public class Sword extends Capacity{

	
	
	public Sword(int characteristic) {
		super(characteristic);
		this.characteristic = characteristic;
	}
	
	public int getPower (Fighter fighter) {
		return fighter.getStrength()*this.characteristic/100;
	}

}
