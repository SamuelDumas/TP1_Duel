package implementation.capacity;

import implementation.combattant.Fighter;

public class OffensiveSpell extends Capacity{


	public OffensiveSpell(int characteristic) {
		super(characteristic);
	 
	}

	public int getPower(Fighter fighter) {
	return (fighter.getIntelligence() * characteristic / 100)* 3;
	}
}
