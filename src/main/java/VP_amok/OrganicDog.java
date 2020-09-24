package VP_amok;

public class OrganicDog extends OrganicPet {

    private int cageCleanLevel;
    private int needsWalkLevel;

    public int getCageClean() {return cageCleanLevel;}
    public int getNeedsWalk() {return needsWalkLevel;}

    //Constructor- any changes to characteristics have to be done here.
    public OrganicDog(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int cageCleanLevel, int needsWalkLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, wellnessLevel);
        this.cageCleanLevel = cageCleanLevel;
        this.needsWalkLevel = needsWalkLevel;
    }
        public void cleanCage () {cageCleanLevel += 20;}
        public void dogWalk () { needsWalkLevel -= 20;}

        //@Override - Example
        //public void feedPet() {
        //hungerLevel -= 10;
        //thirstLevel +=2;

}
