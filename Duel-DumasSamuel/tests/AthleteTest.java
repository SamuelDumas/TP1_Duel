import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import exceptions.combattant.IllegalAthleteAbilityException;
import implementation.combattant.Athlete;

class AthleteTest {

	public static final String ANY_NAME = "Rita";
	public static final int ANY_STRENGTH = 20;
	public static final int ANY_DEXTERITY = 20;
	public static final int ANY_INTELLIGENCE = 20;
	public static final int ANY_CONCENTRATION = 20;
	public static final int VALID_ATHLETE_LIFE= 120;
	public static final int CAPACITY_CHARCTERISTIC= 10;
	public static final int CAPACITY_CHARCTERISTIC_2= 15;
	private ICombattant newAthlete;
	ICapacity capacity1;
	ICapacity capacity2;
	


	@BeforeEach
	public void setUpNewFighter() {
	
		newAthlete = new Athlete(ANY_NAME, ANY_STRENGTH,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION,capacity1,capacity2);
	}
	@Test
	public void createFighter_shouldInitializeName() {
		assertEquals(ANY_NAME, newAthlete.getName());
	}
	@Test
	public void createFighter_shouldInitializeStrength() {
		assertEquals(ANY_STRENGTH, newAthlete.getStrength());
	}
	@Test
	public void createFighter_shouldInitializeDexterity() {
		assertEquals(ANY_DEXTERITY, newAthlete.getDexterity());
	}
	@Test
	public void createFighter_shouldInitializeIntelligence() {
		assertEquals(ANY_INTELLIGENCE, newAthlete.getIntelligence());
	}
	@Test
	public void createFighter_shouldInitializeConcentration() {
		assertEquals(ANY_CONCENTRATION, newAthlete.getConcentration());
	}
	@Test
	public void createFighter_shouldInitializeLife() {
		assertEquals(VALID_ATHLETE_LIFE, newAthlete.getLife());
	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
    @Test
    void createAnAthleteWithIllegalAbility_throwException() {
          //Arrange
        thrown.expect(IllegalAthleteAbilityException.class);
        //Act //Assert
        Assertions.assertThrows(IllegalAthleteAbilityException.class, () -> {
            @SuppressWarnings("unused")
            ICombattant newAthlete = new Athlete(ANY_NAME, ANY_STRENGTH,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION - 1,capacity1,capacity2);
            });
    }
    @Test
	public void createFighter_shouldInitializeFightingCapacity() {
		assertEquals(capacity1, newAthlete.getFightingCapacity());
	}
    @Test
	public void createFighter_shouldInitializeHealingCapacity() {
		assertEquals(capacity1, newAthlete.getHealingCapacity());
	}

    
}
