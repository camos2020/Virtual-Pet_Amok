package VP_amokTest;

import VP_amok.RoboticCat;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class RoboticCatTest {

    @Test
    public void shouldIncreaseOilLevelBy20WhenOilAdded() {
        RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.fillOil();
        int currentOil = underTest.getOil();
        assertEquals(currentOil, 40);
    }
    @Test
    public void shouldIncreaseMaintenanceLevelBy20WhenPetFixed() {
        RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.fixPet();
        int currentMaintenance = underTest.getMaintenance();
        assertEquals(currentMaintenance, 40);
    }
    @Test
    public  void  shouldDecreaseBoredomBy20WhenPlayedWithByRemote() {
        RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.playWithPetByRemote();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 80);
    }
}




