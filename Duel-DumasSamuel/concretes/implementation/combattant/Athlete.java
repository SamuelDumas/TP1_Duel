package implementation.combattant;

import abstracts.combattant.ICapacity;
import exceptions.combattant.IllegalAthleteAbilityException;

public class Athlete extends Fighter {

	public Athlete(String name, int strength,int dexterity,int intelligence,int concentration,ICapacity FightingCapacity,ICapacity HealingCapacity) {
		super(name,strength,dexterity,intelligence,concentration,FightingCapacity,HealingCapacity);
		validateAthleteAbilities(strength,dexterity,intelligence,concentration);
	}

	private void validateAthleteAbilities(int strength,int dexterity,int intelligence,int concentration) {
		if(!(strength>= 20 && dexterity >= 20 && intelligence >= 20 && concentration >= 20))throw new IllegalAthleteAbilityException();
		
	}

	

}
