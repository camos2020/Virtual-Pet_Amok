package Shelter;
import Shelter.OrganicDog;
import Shelter.OrganicPet;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class OrganicDogTest {



     @Test
    public  void  shouldDecreaseHungerBy20WhenFed()  {
        OrganicDog underTest = new OrganicDog();
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 80);
    }

    @Test
    public  void  shouldDecreaseThirstBy20WhenWatered() {
        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20,20, 100, 20);
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 80);
    }
    @Test
    public  void  shouldDecreaseBoredomBy20WhenPlayedWith() {
        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100,20,20, 100,20);
        underTest.PlayWithPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 80);
    }
    @Test
    public  void  shouldIncreaseCageCleanlinessBy20WhenCageCleaned() {
        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 100,20);
        underTest.cleanCage();
        int currentCageClean = underTest.getCageClean();
        assertEquals(currentCageClean, 40);
    }
    @Test
    public  void  shouldIncreaseWellnessBy20WhenVisitsVet() {
        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 100,20 );
        underTest.takePetToVet();
        int currentWellness = underTest.getWellness();
        assertEquals(currentWellness, 40);
    }
    @Test
    public  void  shouldDecreaseNeedsWalkBy20WhenWalked() {
        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 100,20);
        underTest.dogWalk();
        int currentNeedsWalk = underTest.getNeedsWalk();
        assertEquals(currentNeedsWalk, 80);
    }

//    @Test
//    public  void  shouldIncreaseHappinessBy20WithPositiveInteraction() {
//        OrganicDog underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 100, 20);
//        underTest.takePetToVet();
//        int currentWellness = underTest.getWellness();
//        assertEquals(currentWellness, 40);
//    }
}




