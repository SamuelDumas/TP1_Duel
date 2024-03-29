package Duel;

import abstracts.combattant.IDuel;
import implementation.combattant.Fighter;

public class Duel implements IDuel {
	private Fighter offensiveFighter;
	private Fighter defensiveFighter;


	public Duel(Fighter offensiveFighter, Fighter defensiveFighter) {
		this.offensiveFighter = offensiveFighter;
		this.defensiveFighter = defensiveFighter;
		fight(offensiveFighter, defensiveFighter);
	}
	public Fighter getOffensiveFighter() {
		return this.offensiveFighter;
	}
	public Fighter getdefensiveFighter() {
		return this.defensiveFighter;
	}
	public void fight(Fighter offensiveFighter,  Fighter defensiveFighter) {
		int offensiveFighterAttackPower = offensiveFighter.getOffensiveCapacityPower(offensiveFighter);
		int defensiveFighterAtackPower = defensiveFighter.getDefensiveCapacityPower(defensiveFighter);
		Fighter winner = offensiveFighter;
		Fighter loser = defensiveFighter;
		if(offensiveFighterAttackPower > defensiveFighterAtackPower) {
			defensiveFighter.removeLifePointsToFighter(offensiveFighterAttackPower - defensiveFighterAtackPower);
			winner = offensiveFighter;
			loser = defensiveFighter;
		}
		else if (offensiveFighterAttackPower < defensiveFighterAtackPower) {
			offensiveFighter.removeLifePointsToFighter(defensiveFighterAtackPower - offensiveFighterAttackPower);
			winner = defensiveFighter;
			loser = offensiveFighter;
		}
		endDuel(winner,loser);
	}

	private void endDuel(Fighter winner, Fighter loser) {
		winner.strength = winner.strength++;
		winner.dexterity = winner.dexterity++;
		winner.intelligence = winner.intelligence++;
		winner.concentration = winner.concentration++;
		loser.strength = loser.strength--;
		loser.dexterity = loser.dexterity--;
		loser.intelligence = loser.intelligence--;
		loser.concentration = loser.concentration--;
		
	}
}
