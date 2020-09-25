package Shelter;
import Shelter.RoboticPet;

public class RoboticDog  extends RoboticPet {

    public int boredomLevel;
    private int oilLevel;
    private int maintenanceLevel;
    private int happinessLevel;//Various activities
    //    protected String petName;
    //    protected String description;
    //    private int ownerResponse = 0;

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    //Constructor- any changes to characteristics have to be done here.
    public RoboticDog(String petName, String description, int boredomLevel, int oilLevel, int maintenanceLevel, int happinessLevel) {
        super(petName, description, boredomLevel, oilLevel, maintenanceLevel);
        this.boredomLevel = boredomLevel;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.happinessLevel = happinessLevel;
    }

}

//        public void playWithPetByRemote() {
//            boredomLevel-= 20;
//    }
//        public void fillOil() {
//            oilLevel += 20;
//        }
//        public void fixPet() {
//        public void fixPet() {maintenanceLevel += 20; }
//        public void makePetHappy () {happinessLevel += 20; }
//    }
    //@Override - Example
    //public void feedPet() {
    //hungerLevel -= 10;
    //thirstLevel +=2;


