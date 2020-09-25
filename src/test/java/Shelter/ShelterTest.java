package Shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {
    Shelter underTest = new Shelter();

    RoboticDog roboticDog = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20, 20);
    RoboticCat roboticCat = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20, 20);

    OrganicDog organicDog = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 100, 100, 20);
    OrganicCat organicCat  = new OrganicCat("Kitty", "Hyper", 100, 100, 100, 20, 100, 100, 20);

@Test
public void shouldBeAbletoAddRoboDogName(){
    underTest.add(roboticDog);
    VirtualPet foundRoboDog = underTest.findRoboticPet("RoboTaz");
    assertEquals("RoboTaz", foundRoboDog.getPetName());
}
    @Test
    public void shouldBeAbletoAddRoboCatName() {
        underTest.add(roboticCat);
        VirtualPet foundRoboCat = underTest.findRoboticPet("RoboKitty");
        assertEquals("RoboKitty", foundRoboCat.getPetName());
    }

    @Test
    public void shouldBeAbletoAddOrgDogName() {
        underTest.add(organicDog);
        VirtualPet foundOrgDog = underTest.findOrganicPet("Taz");
        assertEquals("Taz", foundOrgDog.getPetName());
    }

    @Test
    public void shouldBeAbletoAddOrgCatName() {
        underTest.add(organicCat);
        VirtualPet foundOrgCat = underTest.findOrganicPet("Kitty");
        assertEquals("Kitty", foundOrgCat.getPetName());
    }

    }

