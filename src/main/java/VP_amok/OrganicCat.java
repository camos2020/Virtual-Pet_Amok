package VP_amok;

public class OrganicCat {

        private String name;
        private String description;
        private int hungerLevel;
        private int thirstLevel;
        private int boredomLevel;
        private int litterBoxLevel;
        private int wellnessLevel;
        private int needsPettingLevel;


    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getHunger() {
        return hungerLevel;
    }
    public int getThirst() {
        return thirstLevel;
    }
    public int getBoredom() {
        return boredomLevel;
    }
    public int getWellness() {
        return wellnessLevel;
    }
    public int getLitterBox() {
        return litterBoxLevel;
    }
    public int getNeedsPetting() {
        return needsPettingLevel;
    }

    
    //Constructor- any changes to characteristics have to be done here.
    public OrganicCat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int litterBoxLevel, int needsPettingLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.wellnessLevel = wellnessLevel;
        this.litterBoxLevel = litterBoxLevel;
        this.needsPettingLevel = needsPettingLevel;
        }

public void feedPet() {
        hungerLevel -=20;
        }
public void waterPet() {
        thirstLevel -= 20;
        }
public void PlayWithPet() {
        boredomLevel -=20;
        }
public void cleanLitterBox() {
        litterBoxLevel +=20;
        }
public void vetVisit() {
        wellnessLevel +=20;
        }
public void catPetting() {
        needsPettingLevel -=20;
    }
}
