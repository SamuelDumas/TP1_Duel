package implementation.combattant;

import java.util.ArrayList;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import exceptions.combattant.IllegalFighterAbilityException;

public abstract class Fighter implements ICombattant {
	private final int DEFAULT_LIFE_POINTS = 200;
	public final static int MAX_APTITUDE_POINTS = 100;
	private String name;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int concentration;
	protected static int life;
	protected ArrayList<ICapacity> capacityList = new ArrayList<ICapacity>();
	
	public Fighter(String name, int strength,int dexterity,int intelligence,int concentration,ICapacity FightingCapacity,ICapacity HealingCapacity) {
		validateFighterAbilityPoints(strength,dexterity,intelligence,concentration);
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.concentration = concentration;
		capacityList.add(FightingCapacity);
		capacityList.add(HealingCapacity);
		Fighter.life = DEFAULT_LIFE_POINTS-(strength+dexterity+intelligence+concentration);
		
	}
	
	private void validateFighterAbilityPoints(int strength,int dexterity,int intelligence,int concentration) {
		if((this.strength + this.dexterity + this.intelligence + this.concentration)> MAX_APTITUDE_POINTS) throw new IllegalFighterAbilityException();
	}
	public String getName(){
		return this.name;
	}
	public int getStrength(){
		return this.strength;
	}
	public int getDexterity(){
		return this.dexterity;
	}
	public int getIntelligence(){
		return this.intelligence;
	}
	public int getConcentration(){
		return this.concentration;
	}
	public int getLife(){
		return Fighter.life;
	}
	public ICapacity getFightingCapacity(){
		return capacityList.get(0);
		
	}
	public ICapacity getHealingCapacity(){
		return capacityList.get(1);
	}
	public void addLifePointsToFighter(int lifePoints) {
		Fighter.life = Fighter.life + lifePoints;
	}
	public void removeLifePointsToFighter(int lifePoints) {
		Fighter.life = Fighter.life - lifePoints;
	}
	public int getOffensiveCapacityPower(Fighter fighter) {
		ICapacity capacity = capacityList.get(0);
		return capacity.getPower(fighter);
	}
	public int getDefensiveCapacityPower(Fighter fighter) {
		ICapacity capacity = capacityList.get(1);
		return capacity.getPower(fighter);
	}
}
