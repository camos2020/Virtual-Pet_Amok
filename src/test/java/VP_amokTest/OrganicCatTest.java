package VP_amokTest;

import VP_amok.OrganicCat;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("Kitty", "Relaxed", 100, 100, 100, 20, 20,100);


    @Test
    public  void  shouldDecreaseHungerBy20WhenFed()  {
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 80);
    }

    @Test
    public  void  shouldDecreaseThirstBy20WhenWatered() {
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 80);
    }
    @Test
    public  void  shouldDecreaseBoredomBy20WhenPlayedWith() {
        underTest.PlayWithPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 80);
    }
    @Test
    public  void  shouldIncreaseLitterBoxCleanlinessBy20WhenLitterBoxCleaned() {
        underTest.cleanLitterBox();
        int currentLitterBox = underTest.getLitterBox();
        assertEquals(currentLitterBox, 40);
    }
    @Test
    public  void  shouldIncreaseWellnessBy20WhenVisitsVet() {
        underTest.vetVisit();
        int currentWellness = underTest.getWellness();
        assertEquals(currentWellness, 40);
    }
    @Test
    public  void  shouldIncreaseHappyPurBy20WhenCatGetsPetted() {
        underTest.catPetting();
        int currentNeedsPetting = underTest.getNeedsPetting();
        assertEquals(currentNeedsPetting, 80);
    }

}
