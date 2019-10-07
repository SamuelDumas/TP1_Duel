import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import exceptions.combattant.IllegalMagicianAbilityException;
import implementation.combattant.Magician;

class MagicianTest {

	public static final String ANY_NAME = "Rita";
	public static final int ANY_STRENGTH = 10;
	public static final int ANY_DEXTERITY = 15;
	public static final int ANY_INTELLIGENCE = 30;
	public static final int ANY_CONCENTRATION = 30;
	public static final int VALID_WARRIOR_LIFE= 115;
	
private ICombattant newMagician;
private ICapacity capacity1;
private ICapacity capacity2;

	@BeforeEach
	public void setUpNewFighter() {
		newMagician = new Magician(ANY_NAME, ANY_STRENGTH,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION,capacity1,capacity2);
	}
	@Test
	public void createFighter_shouldInitializeName() {
		assertEquals(ANY_NAME, newMagician.getName());
	}
	@Test
	public void createFighter_shouldInitializeStrength() {
		assertEquals(ANY_STRENGTH, newMagician.getStrength());
	}
	@Test
	public void createFighter_shouldInitializeDexterity() {
		assertEquals(ANY_DEXTERITY, newMagician.getDexterity());
	}
	@Test
	public void createFighter_shouldInitializeIntelligence() {
		assertEquals(ANY_INTELLIGENCE, newMagician.getIntelligence());
	}
	@Test
	public void createFighter_shouldInitializeConcentration() {
		assertEquals(ANY_CONCENTRATION, newMagician.getConcentration());
	}
	@Test
	public void createFighter_shouldInitializeLife() {
		assertEquals(VALID_WARRIOR_LIFE, newMagician.getLife());
	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
    @Test
    void createAMagicianWithIllegalAbility_throwException() {
          //Arrange
        thrown.expect(IllegalMagicianAbilityException.class);
        //Act //Assert
        Assertions.assertThrows(IllegalMagicianAbilityException.class, () -> {
            @SuppressWarnings("unused")
            ICombattant newMagician = new Magician(ANY_NAME, ANY_STRENGTH,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION - 1,capacity1,capacity2);
            });
    }
    @Test
	public void createFighter_shouldInitializeFightingCapacity() {
		assertEquals(capacity1, newMagician.getFightingCapacity());
	}
    @Test
	public void createFighter_shouldInitializeHealingCapacity() {
		assertEquals(capacity1, newMagician.getHealingCapacity());
	}

	

}
