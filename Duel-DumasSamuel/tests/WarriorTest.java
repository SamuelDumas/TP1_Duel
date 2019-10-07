import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import abstracts.combattant.ICapacity;
import abstracts.combattant.ICombattant;
import exceptions.combattant.IllegalWarriorAbilityException;
import implementation.combattant.Warrior;


public class WarriorTest {

	public static final String ANY_NAME = "Rita";
	public static final int ANY_STRENGTH = 40;
	public static final int ANY_DEXTERITY = 30;
	public static final int ANY_INTELLIGENCE = 20;
	public static final int ANY_CONCENTRATION = 10;
	public static final int VALID_WARRIOR_LIFE= 100;
	
private ICombattant newWarrior;
private ICapacity capacity1;
private ICapacity capacity2;

	@BeforeEach
	public void setUpNewFighter() {
		newWarrior = new Warrior(ANY_NAME, ANY_STRENGTH,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION,capacity1,capacity2);
	}
	@Test
	public void createFighter_shouldInitializeName() {
		assertEquals(ANY_NAME, newWarrior.getName());
	}
	@Test
	public void createFighter_shouldInitializeStrength() {
		assertEquals(ANY_STRENGTH, newWarrior.getStrength());
	}
	@Test
	public void createFighter_shouldInitializeDexterity() {
		assertEquals(ANY_DEXTERITY, newWarrior.getDexterity());
	}
	@Test
	public void createFighter_shouldInitializeIntelligence() {
		assertEquals(ANY_INTELLIGENCE, newWarrior.getIntelligence());
	}
	@Test
	public void createFighter_shouldInitializeConcentration() {
		assertEquals(ANY_CONCENTRATION, newWarrior.getConcentration());
	}
	@Test
	public void createFighter_shouldInitializeLife() {
		assertEquals(VALID_WARRIOR_LIFE, newWarrior.getLife());
	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
    @Test
    void createAWarriorWithIllegalAbility_throwException() {
          //Arrange
        thrown.expect(IllegalWarriorAbilityException.class);
        //Act //Assert
        Assertions.assertThrows(IllegalWarriorAbilityException.class, () -> {
            @SuppressWarnings("unused")
            ICombattant newWarrior = new Warrior(ANY_NAME, ANY_STRENGTH-1,ANY_DEXTERITY,ANY_INTELLIGENCE,ANY_CONCENTRATION,capacity1,capacity2);
            });
    }
    @Test
	public void createFighter_shouldInitializeFightingCapacity() {
		assertEquals(capacity1, newWarrior.getFightingCapacity());
	}
    @Test
	public void createFighter_shouldInitializeHealingCapacity() {
		assertEquals(capacity1, newWarrior.getHealingCapacity());
	}
	
}
