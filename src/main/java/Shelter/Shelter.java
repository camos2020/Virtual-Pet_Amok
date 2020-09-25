package Shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {
    Map<String, VirtualPet> petList = new HashMap<>();

    public void add(RoboticDog roboticDog) {
        petList.put(roboticDog.getPetName(), roboticDog );
    }

    public void add(RoboticCat roboticCat) {
        petList.put(roboticCat.getPetName(), roboticCat );
    }

    public VirtualPet findRoboticPet(String petName) {
        return petList.get(petName);
    }
    public VirtualPet findOrganicPet(String petName) {
        return petList.get(petName);
    }
    public void add(OrganicDog organicDog) {
        petList.put(organicDog.getPetName(), organicDog);
    }
        public void add(OrganicCat organicCat) {
        petList.put(organicCat.getPetName(), organicCat);
    }
}


//Map<String, VirtualPet> petList = new HashMap<>();