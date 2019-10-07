import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Duel.Duel;
import abstracts.combattant.ICapacity;
import implementation.combattant.Fighter;

class DuelTest {

	private Fighter newAthlete;
	private Fighter newAthlete2;
	private Duel duel;
	ICapacity capacity1;
	ICapacity capacity2;
	
	@BeforeEach
	public void setUpNewFighter() {

		duel = new Duel(newAthlete,newAthlete2);
	}
	@Test
	public void DuelIsCreated_shouldInitializeAOffensiveFighter() {
		assertEquals(newAthlete, duel.getOffensiveFighter());
	}
	@Test
	public void DuelIsCreated_shouldInitializeADefensiveFighter() {
		assertEquals(newAthlete, duel.getdefensiveFighter());	
	}

}
