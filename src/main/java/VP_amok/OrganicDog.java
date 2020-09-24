package VP_amok;

public class OrganicDog {

    private String name;
    private String description;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int cageCleanLevel;
    private int wellnessLevel;
    private int needsWalkLevel;

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
        public int getcageClean() {
        return cageCleanLevel;
    }
        public int getWellness() {
        return wellnessLevel;
    }
        public int getNeedsWalk() {
        return needsWalkLevel;
    }


            //Constructor- any changes to characteristics have to be done here.
    public OrganicDog(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int cageCleanLevel, int needsWalkLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.wellnessLevel = wellnessLevel;
        this.cageCleanLevel = cageCleanLevel;
        this.needsWalkLevel = needsWalkLevel;
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
        public void cleanCage() {
        cageCleanLevel +=20;
        }
        public void vetVisit() {
        wellnessLevel +=20;
        }
        public void dogWalk() {
        needsWalkLevel -=20;
    }
}
