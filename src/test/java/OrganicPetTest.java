import Shelter.OrganicCat;
import Shelter.OrganicDog;
import Shelter.OrganicPet;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public abstract class OrganicPetTest {

    OrganicDog organicDog = new OrganicDog();
    OrganicCat organicCat = new OrganicCat();


//    OrganicDog organicDog = new OrganicDog ("Taz", "Hyper", 100,100,100,20,20, 20, 20);
//    OrganicCat organicCat = new OrganicCat ("Kitty", "Calm", 100,100,100,20,20, 20, 20);

    public OrganicPetTest(String name, String description) {
    }

    @Test
    public void shouldIncreaseHappinessBy20WithPositiveInteraction() {
        OrganicPet underTest = new OrganicCat();
    }
}
        //OrganicPet underTest = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 20, 20, 20);
//        underTest.makePetHappy();
//        int currentHappiness = underTest.getHappiness();
//        assertEquals(currentHappiness, 40);
//        }

