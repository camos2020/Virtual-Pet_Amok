package VP_amok;

public class RoboticCat extends RoboticPet{
    private int boredomLevel;
    private int oilLevel;
    private int maintenanceLevel;

    public int getBoredomLevel() { return boredomLevel;}
    public int getOilLevel() { return oilLevel; }
    public int getMaintenanceLevel() { return maintenanceLevel; }

    //Constructor- any changes to characteristics have to be done here.
    public RoboticCat(String name, String description, int boredomLevel, int oilLevel, int maintenanceLevel) {
        super(name, description, boredomLevel, oilLevel, maintenanceLevel);
        this.boredomLevel = boredomLevel;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;

    }
}
