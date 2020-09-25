package Shelter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class RoboticDogTest {

    RoboticDog underTest = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20, 20);

    @Test
    public void shouldIncreaseOilLevelBy20WhenOilAdded() {
        //RoboticDog underTest = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20, 20);
        underTest.fillOil();
        int currentOil = underTest.getOil();
        assertEquals(currentOil, 40);
    }
    @Test
    public void shouldIncreaseMaintenanceLevelBy20WhenPetFixed() {
        //RoboticDog underTest = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20);
        underTest.fixPet();
        int currentMaintenance = underTest.getMaintenance();
        assertEquals(currentMaintenance, 40);
    }
    @Test
    public  void  shouldDecreaseBoredomBy20WhenPlayedWithByRemote() {
        //RoboticDog underTest = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20);
        underTest.playWithPetByRemote();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 80);
    }




}




