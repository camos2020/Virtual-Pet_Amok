package Shelter;

import java.util.Scanner;

public class ShelterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RoboticDog roboticDog = new RoboticDog("RoboTaz", "SuperHyper", 100, 20, 20, 20);
        RoboticCat roboticCat = new RoboticCat("RoboKitty", "SuperCalm", 100, 20, 20, 20);

        OrganicDog organicDog = new OrganicDog("Taz", "Hyper", 100, 100, 100, 20, 100, 100, 20);
        OrganicCat organicCat = new OrganicCat("Kitty", "Hyper", 100, 100, 100, 20, 100, 100, 20);
        System.out.println("Menu Options, Please choose your next action:");
        System.out.println("1. I would like to FEED " + myPet.getPetName());
        System.out.println("2. I would like to provide WATER for " + myPet.getPetName());
        System.out.println("3. I would like to take " + myPet.getPetName() + " to the VET");
        System.out.println("4. I would like to PLAY WITH " + myPet.getPetName());
        System.out.println("5. I would like to put " + myPet.getPetName() + " to sleep");
        System.out.println("6. I would like to EXIT");
        ownerResponse = input.nextLine();


    }
}

