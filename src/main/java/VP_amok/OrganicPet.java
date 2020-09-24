package VP_amok;

public abstract class OrganicPet {
    protected String name;
    protected String description;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;
    protected int wellnessLevel;

    public OrganicPet(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;
        this.thirstLevel = thirstLevel;
        this.wellnessLevel = wellnessLevel;
    }

    public String getName() { return name;}
    public String getDescription() { return description;}
    public int getHunger() { return hungerLevel; }
    public int getThirst() { return thirstLevel;}
    public int getBoredom() { return boredomLevel;};
    public int getWellness() { return  wellnessLevel;}

    public void feedPet() {hungerLevel -= 20;}
    public void PlayWithPet() {boredomLevel -= 20;}
    public void waterPet() { thirstLevel -= 20;}
    public void takePetToVet() { wellnessLevel +=20;}
}

//public void feedPet();  ** Use this method to leave this Method open for @Override
