package implementation.combattant;

import abstracts.combattant.ICapacity;
import exceptions.combattant.IllegalWarriorAbilityException;

public class Warrior extends Fighter{

	public Warrior(String name, int strength,int dexterity,int intelligence,int concentration,ICapacity FightingCapacity,ICapacity HealingCapacity) {
		super(name,strength,dexterity,intelligence,concentration,FightingCapacity,HealingCapacity);
		validateWarriorAbilities(strength,dexterity,intelligence,concentration);
	}

	private void validateWarriorAbilities(int strength,int dexterity,int intelligence,int concentration) {
		if(!(strength >= dexterity + 10 && dexterity+10 >= intelligence + 10 && intelligence+10 >= concentration))throw new IllegalWarriorAbilityException();
		
	}


	
}
