package VP_amok;

public class OrganicCat extends OrganicPet {

    private int litterBoxLevel;
    private int needsPettingLevel;

    public int getLitterBox() {
        return litterBoxLevel;
    }
    public int getNeedsPetting() {
        return needsPettingLevel;
    }

      //Constructor- any changes to characteristics have to be done here.
    public OrganicCat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int litterBoxLevel, int needsPettingLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, wellnessLevel);
        this.litterBoxLevel = litterBoxLevel;
        this.needsPettingLevel = needsPettingLevel;
    }

    public void cleanLitterBox() {
        litterBoxLevel +=20;
        }

    public void catPetting() {
        needsPettingLevel -=20;
    }


}
