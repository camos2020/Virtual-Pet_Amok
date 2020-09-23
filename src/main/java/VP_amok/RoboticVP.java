package VP_amok;
public class RoboticVP {

    private static final int DEFAULT_OIL_LEVEL = 50;
    private int oilLevel = DEFAULT_OIL_LEVEL;


    public int getOilLevel1() {
        return oilLevel;
    }

    public void addOil(int amount) {
        oilLevel -= amount;
    }

    public void fillOil(RoboticVP roboticVP) {
    }

    public int getOilLevel1(RoboticVP roboticVP) {
        return oilLevel;
    }
}
