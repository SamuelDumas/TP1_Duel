package implementation.capacity;

import implementation.combattant.Fighter;

public class DefensiveSpell extends Capacity{


	public DefensiveSpell(int characteristic) {
		super(characteristic);
	}
	public int getPower(Fighter fighter) {
		return  (fighter.getIntelligence() * characteristic / 100)*3;
	}


}