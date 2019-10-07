package implementation.capacity;

import implementation.combattant.Fighter;

public class Cure extends Capacity{


	public Cure(int characteristic) {
		super(characteristic);
	}

	@Override
	public int getPower(Fighter fighter) {
		return fighter.getDexterity()*this.characteristic/100;
		
	}


}
