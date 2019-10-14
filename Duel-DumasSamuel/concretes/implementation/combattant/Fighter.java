package implementation.combattant;

import java.util.ArrayList;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import exceptions.combattant.IllegalFighterAbilityException;

public abstract class Fighter implements ICombattant {//MS Attention la classe est abstraite, mais elle se retrouve dans le package "concrete"...
	private final int DEFAULT_LIFE_POINTS = 200;
	public final static int MAX_APTITUDE_POINTS = 100;
	private String name;
	public int strength;//MS POO1: On ne doit JAMAIS mettre une propriété public!
	public int dexterity;
	public int intelligence;
	public int concentration;
	protected static int life;//MS Pourquoi life est static?
	protected ArrayList<ICapacity> capacityList = new ArrayList<ICapacity>();//MS On aurait été mieux de mettre un get/set que de mettre la liste protected.
	
	public Fighter(String name, int strength,int dexterity,int intelligence,int concentration,ICapacity FightingCapacity,ICapacity HealingCapacity) {
		validateFighterAbilityPoints(strength,dexterity,intelligence,concentration);//MS Pourquoi est-il obligatoire de créer un fighter avec une capacité d'attaque et une de soin?
		this.name = name;															//MS ICapacity permet de mettre n'importe quelle capacité dans la variable FightingCapacity.
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
	public ICapacity getFightingCapacity(){//MS Qu'est-ce que je fais si j'ai une DefenseCapacity?
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
	public int getOffensiveCapacityPower(Fighter fighter) {//MS pas besoin de passer un fighter en parametre, on lui donne "this".
		ICapacity capacity = capacityList.get(0);//MS Il faut mettre un getPower(ICapacity) afin de choisir dynamiquement la bonne stratégie.
		return capacity.getPower(fighter);
	}
	public int getDefensiveCapacityPower(Fighter fighter) {
		ICapacity capacity = capacityList.get(1);
		return capacity.getPower(fighter);
	}
}
