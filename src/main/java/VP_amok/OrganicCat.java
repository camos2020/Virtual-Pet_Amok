package VP_amok;

public class OrganicCat extends OrganicPet {

    private int litterBoxLevel;
    private int needsToBePettedLevel;

    public int getLitterBox() {
        return litterBoxLevel;
    }
    public int getNeedsToBePetted() {
        return needsToBePettedLevel;
    }

      //Constructor- any changes to characteristics have to be done here.
    public OrganicCat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int litterBoxLevel, int needsToBePettedLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, wellnessLevel);
        this.litterBoxLevel = litterBoxLevel;
        this.needsToBePettedLevel = needsToBePettedLevel;
    }

    public void emptyLitterBox() {
        litterBoxLevel -=20;
        }
    public void catPetting() {
        needsToBePettedLevel -=20;
    }

}
