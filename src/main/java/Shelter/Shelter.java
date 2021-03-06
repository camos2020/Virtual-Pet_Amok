package Shelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {
    Map<String, VirtualPet> petList = new HashMap<>();
    Map<Integer, OrganicDog> orgDogList = new HashMap<>();

    public void add(RoboticDog roboticDog) {petList.put(roboticDog.getPetName(), roboticDog ); }
    public void add(RoboticCat roboticCat) {
        petList.put(roboticCat.getPetName(), roboticCat );
    }
    public void add(VirtualPet petsToAdd) {
        petList.put(petsToAdd.getPetName(), petsToAdd );
    }

    public VirtualPet findRoboticPet(String petName) {
        return petList.get(petName);
    }
    public VirtualPet findOrganicPet(String petName) {
        return petList.get(petName);
    }
    public VirtualPet findVirtualPet(String petName) { return petList.get(petName);}

    public void add(OrganicDog organicDog) {
        petList.put(organicDog.getPetName(), organicDog);
    }
    public void add(OrganicCat organicCat) {
        petList.put(organicCat.getPetName(), organicCat);
    }
//    public void accept(OrganicDog pleaseWalkMeDog) {  petList.put(getShelterPets();
//        }
//    public void accept(OrganicDog pleaseDONTWalkMeDog) {  petList.put(getShelterPets();
//    }
    public Collection<VirtualPet> getAllPets() {
        return petList.values();
    }

    public Collection<VirtualPet> getShelterPets() {
        Collection<VirtualPet> shelterPets = new ArrayList<>();
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof WalkDog) {
                shelterPets.add(pet);
            }
        }
        return shelterPets;
    }

    private void values() {
    }

//    public void accept(OrganicDog pleaseWalkMeDog) {
//
//        return acceptedPets;
    }

//    public void accept(OrganicDog petToAccept) {
//        String acceptedPets = VirtualPet;
//        orgDogList.put(acceptedPets, petToAccept);





