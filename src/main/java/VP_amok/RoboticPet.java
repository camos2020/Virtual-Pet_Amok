package VP_amok;

public abstract class RoboticPet {
    protected String name;
    protected String description;
    protected int boredomLevel;
    protected int oilLevel;
    protected int maintenanceLevel;


    public RoboticPet(String name, String description, int boredomLevel, int oilLevel, int maintenanceLevel) {
        this.name = name;
        this.description = description;
        this.boredomLevel = boredomLevel;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getBoredom() { return boredomLevel; }
    public int getOil() {
        return oilLevel;
    }
    public int getMaintenance() { return maintenanceLevel;}

    public void fixPet() {
        maintenanceLevel += 20;
    }
    public void playWithPetByRemote() {boredomLevel -= 20;}
    public void fillOil() {
        oilLevel += 20;
    }
}
