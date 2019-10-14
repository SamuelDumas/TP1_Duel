package Infirmary;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import abstracts.combattant.IInfirmary;

public class Infirmary implements IInfirmary {

	public Infirmary(ICombattant fighter) {//MS L'infirmerie doit �tre disponible pour tous les fighters. On ne doit pas en donner un en param�tre.
		healFighter(fighter);//MS Ce n'est pas le constructeur qui appelle la m�thode. C'est la classe utilisatrice au besoin.
	}
	
	public void healFighter(ICombattant fighter) {
		ICapacity capacity = fighter.getHealingCapacity();
		int healingPoints = capacity.getCharacteristic();
		fighter.addLifePointsToFighter(healingPoints);
		
	}
}
