package Infirmary;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import abstracts.combattant.IInfirmary;

public class Infirmary implements IInfirmary {

	public Infirmary(ICombattant fighter) {
		healFighter(fighter);
	}
	
	public void healFighter(ICombattant fighter) {
		ICapacity capacity = fighter.getHealingCapacity();
		int healingPoints = capacity.getCharacteristic();
		fighter.addLifePointsToFighter(healingPoints);
		
	}
}
