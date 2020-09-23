package VP_amok;

public class ShelterWorker {
    public String getEmpName;
    private String empName;

    public ShelterWorker(String empNumber, String empName, String empShift) {
        empName = ("Shelly");
        empShift = ("AM");
        
        //empName.setEmpName();
        //empShift.setEmpShift();

    }

    public ShelterWorker() {

    }

    public void fillOil(RoboticVP roboticVP) {
        roboticVP.addOil(10);
    }


    public String setEmpName(String shelly) {
        return shelly;
    }

    public String getempName() {
        return empName;
    }

    public void getEmpName(String shelly) {
    }
}
