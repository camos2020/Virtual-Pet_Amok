package Shelter;
import Shelter.RoboticPet;

public class RoboticCat extends RoboticPet {
    private int boredomLevel;
    private int oilLevel;
    private int maintenanceLevel;
    private int happinessLevel;//Various activities
    //    protected String petName;
    //    protected String description;
    //    private int ownerResponse = 0;

    public int getBoredom() {
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
    public RoboticCat(String name, String description, int boredomLevel, int oilLevel, int maintenanceLevel, int happinessLevel) {
        super(name, description, boredomLevel, oilLevel, maintenanceLevel);
        this.boredomLevel = boredomLevel;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.happinessLevel = happinessLevel;

//        public void playWithPetByRemote() {boredomLevel -= 20;}
//        public void fillOil() { oilLevel += 20; }
//        public void fixPet() {maintenanceLevel += 20; }
//        public void makePetHappy () {happinessLevel += 20; }
//    }
    }
}
