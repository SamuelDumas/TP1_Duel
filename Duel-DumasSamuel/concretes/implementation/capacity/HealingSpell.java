package implementation.capacity;

import implementation.combattant.Fighter;

public class HealingSpell extends Capacity {


	public HealingSpell(int characteristic) {
		super(characteristic);
		
	}

	public int getPower(Fighter fighter) {
		return fighter.getIntelligence() * characteristic / 100;
		
	}

}
