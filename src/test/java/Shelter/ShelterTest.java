package Shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {
    Shelter underTest = new Shelter();

    RoboticDog roboticDog = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20, 20);
    RoboticCat roboticCat = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20, 20);

    OrganicDog organicDog = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 100, 100, 20);
    OrganicCat organicCat = new OrganicCat("Kitty", "Hyper", 100, 100, 100, 20, 100, 100, 20);

    @Test
    public void shouldBeAbleToAddRoboDogName() {
        underTest.add(roboticDog);
        VirtualPet foundRoboDog = underTest.findRoboticPet("RoboTaz");
        assertEquals("RoboTaz", foundRoboDog.getPetName());
    }

    @Test
    public void shouldBeAbleToAddRoboCatName() {
        underTest.add(roboticCat);
        VirtualPet foundRoboCat = underTest.findRoboticPet("RoboKitty");
        assertEquals("RoboKitty", foundRoboCat.getPetName());
    }

    @Test
    public void shouldBeAbleToAddOrgDogName() {
        underTest.add(organicDog);
        VirtualPet foundOrgDog = underTest.findOrganicPet("Taz");
        assertEquals("Taz", foundOrgDog.getPetName());
    }

    @Test
    public void shouldBeAbleToAddOrgCatName() {
        underTest.add(organicCat);
        VirtualPet foundOrgCat = underTest.findOrganicPet("Kitty");
        assertEquals("Kitty", foundOrgCat.getPetName());
    }

    @Test
    public void shouldBeAbleToAddAll4VariousPetTypes() {
        underTest.add(organicCat);
        underTest.add(organicDog);
        underTest.add(roboticCat);
        underTest.add(roboticDog);
//        underTest.add(roboticPet);
//        underTest.add(organicPet);
        VirtualPet foundOrgCat = underTest.findOrganicPet("Kitty");
        VirtualPet foundOrgDog = underTest.findOrganicPet("Taz");
        VirtualPet foundRoboCat = underTest.findRoboticPet("RoboKitty");
        VirtualPet foundRoboDog = underTest.findRoboticPet("RoboTaz");
//        VirtualPet foundRoboPet = underTest.findRoboticPet("RoboTaz");
//        VirtualPet foundOrgPet = underTest.findOrganicPet("Taz");

        assertEquals("RoboTaz", foundRoboDog.getPetName());
        assertEquals("RoboKitty", foundRoboCat.getPetName());
        assertEquals("Kitty", foundOrgCat.getPetName());
        assertEquals("Taz", foundOrgDog.getPetName());
    }

    @Test
    public void shouldBeAbleToAddACollectionOfPets() {
        underTest.add(organicCat);
        underTest.add(organicDog);
        underTest.add(roboticCat);
        underTest.add(roboticDog);
        Collection<VirtualPet> addedPets = underTest.getAllPets();
        assertThat(addedPets, containsInAnyOrder(organicCat, organicDog, roboticCat, roboticDog));
    }

    @Test
    public void shouldDisplayAllAnimalsAtTheShelter() {
        underTest.add(organicCat);
        underTest.add(organicDog);
        underTest.add(roboticCat);
        underTest.add(roboticDog);
        Collection<VirtualPet> shelterPets = underTest.getShelterPets();
        assertThat(shelterPets, containsInAnyOrder(organicDog, roboticDog));
    }

    @Test
    public void shouldAccept2NewDogs() {
        OrganicDog pleaseWalkMeDog = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 100, 100, 20);
        OrganicDog pleaseDONTWalkMeDog = new OrganicDog("Taz_NoWalk", "Hyper", 100, 100, 100, 20, 100, 10, 20);
        underTest.accept(pleaseWalkMeDog);
        underTest.accept(pleaseDONTWalkMeDog);
        Collection<VirtualPet> acceptedPets = underTest.getAllPets();{
           assertThat(acceptedPets, containsInAnyOrder(pleaseWalkMeDog, pleaseDONTWalkMeDog));
        }
    }
}
    //HospitalEmployees = VirtualPet

