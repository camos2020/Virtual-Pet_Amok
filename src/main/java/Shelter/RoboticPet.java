package Shelter;

public abstract class RoboticPet extends VirtualPet {
    protected int boredomLevel;
    protected int oilLevel;
    protected int maintenanceLevel;
//    protected String petName;
//    protected String description;

    public RoboticPet(String name, String description, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, description);
        this.boredomLevel = boredomLevel;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
//        this.petName = petName;
//        this.description = description;
    }

    public int getBoredom() { return boredomLevel; }
    public int getOil() {
        return oilLevel;
    }
    public int getMaintenance() { return maintenanceLevel;}
//    public String getName() {return petName; }
//    public String getDescription() {  return description;}

    public void fixPet() {
        maintenanceLevel += 20;
    }
    public void playWithPetByRemote() {boredomLevel -= 20;}
    public void fillOil() {
        oilLevel += 20;
    }
}
