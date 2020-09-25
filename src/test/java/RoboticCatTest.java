import Shelter.RoboticCat;
import Shelter.Shelter;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class RoboticCatTest {
    //public RoboticCat(String name, String description, int boredomLevel, int oilLevel, int maintenanceLevel, int happinessLevel);
    RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20, 20);

    @Test
    public void shouldIncreaseOilLevelBy20WhenOilAdded() {
        //RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.fillOil();
        int currentOil = underTest.getOil();
        assertEquals(currentOil, 40);
    }
    @Test
    public void shouldIncreaseMaintenanceLevelBy20WhenPetFixed() {
        //RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.fixPet();
        int currentMaintenance = underTest.getMaintenance();
        assertEquals(currentMaintenance, 40);
    }
    @Test
    public  void  shouldDecreaseBoredomBy20WhenPlayedWithByRemote() {
        //RoboticCat underTest = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20);
        underTest.playWithPetByRemote();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 80);
    }
}




