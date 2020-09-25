package Shelter;

public class OrganicCat extends OrganicPet {

    private int litterBoxLevel;
    private int needsToBePettedLevel;

    //Constructor- any changes to characteristics have to be done here.
    public OrganicCat(String petName, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int litterBoxLevel, int needsToBePettedLevel, int happinessLevel) {
        super(petName, description, hungerLevel, thirstLevel, boredomLevel, wellnessLevel, happinessLevel);
        this.litterBoxLevel = litterBoxLevel;
        this.needsToBePettedLevel = needsToBePettedLevel;
    }

    public OrganicCat() {
        super();
    }

    public int getLitterBox() {
        return litterBoxLevel;
    }
    public int getNeedsToBePetted() {
        return needsToBePettedLevel;
    }

    public void emptyLitterBox() {
        litterBoxLevel -=50;
        }
    public void catPetting() {
        needsToBePettedLevel -=20;
    }

}
