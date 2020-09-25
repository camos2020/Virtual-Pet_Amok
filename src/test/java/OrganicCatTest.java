import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OrganicCatTest {

    OrganicPet underTest = new VP_amok.OrganicPet("Kitty", "Relaxed", 100, 100, 100, 20, 100,100, 20);

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
    public  void  shouldDecreaceLitterBoxLevelBy50WhenCleaned() {
        underTest.emptyLitterBox();
        int currentLitterBox = underTest.getLitterBox();
        assertEquals(currentLitterBox, 50);
    }

    @Test
    public  void  shouldIncreaseWellnessBy20WhenVisitsVet() {
        underTest.takePetToVet();
        int currentWellness = underTest.getWellness();
        assertEquals(currentWellness, 40);
    }

    @Test
    public  void  shouldDecreaseNeedForPettingBy20WhenCatGetsARub() {
        underTest.catPetting();
        int currentNeedsToBePetted = underTest.getNeedsToBePetted();
        assertEquals(currentNeedsToBePetted, 80);
    }

    @Test
    public  void  shouldIncreaseHappinessBy20WithPositiveInteraction() {
        OrganicPet underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 20, 20);
        underTest.makePetHappy();
        int currentHappiness = underTest.getHappiness();
        assertEquals(currentHappiness, 40);
    }

}
