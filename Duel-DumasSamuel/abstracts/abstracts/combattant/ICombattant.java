package abstracts.combattant;

import implementation.combattant.Fighter;

public interface ICombattant {


	public String getName();
	
	public int getStrength();
	
	public int getDexterity();
	
	public int getIntelligence();
	
	public int getConcentration();

	public int getLife();
	
	public ICapacity getFightingCapacity();
	
	public ICapacity getHealingCapacity();

	public void addLifePointsToFighter(int healingPoints);

	public int getOffensiveCapacityPower(Fighter fighter);
	
	public int getDefensiveCapacityPower(Fighter fighter);


}
