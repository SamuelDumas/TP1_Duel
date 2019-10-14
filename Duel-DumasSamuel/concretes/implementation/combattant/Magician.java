package implementation.combattant;

import abstracts.combattant.ICapacity;
import exceptions.combattant.IllegalMagicianAbilityException;

public class Magician extends Fighter{
	public Magician(String name, int strength,int dexterity,int intelligence,int concentration,ICapacity FightingCapacity,ICapacity HealingCapacity) {
		super(name,strength,dexterity,intelligence,concentration,FightingCapacity,HealingCapacity);
		validateMagicianAbilities(strength,dexterity,intelligence,concentration);
	}

	private void validateMagicianAbilities(int strength,int dexterity,int intelligence,int concentration) {
		if(!(intelligence >= max(strength, dexterity) + 15 && concentration >= max(strength, dexterity) + 15 ))throw new IllegalMagicianAbilityException();
		
	}

	private int max(int value1, int value2) { //MS Il existe un package Math dans Java qui fournit une méthode Max(a,b)
		if(value1>value2) {
			return value1;
		}
		else {
			return value2;
		}
		
	}

	
}
