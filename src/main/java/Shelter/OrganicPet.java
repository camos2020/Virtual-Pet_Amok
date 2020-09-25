package Shelter;

public abstract class OrganicPet extends VirtualPet {
    protected int hungerLevel; // Feed Pet.
    protected int thirstLevel; //Give pet water.
    protected int boredomLevel; // Play with pet.
    protected int wellnessLevel; //Take pet to Vet.
    protected int happinessLevel;//Various activities
    //    protected String petName;
//    protected String description;
//    private int ownerResponse = 0;

    public OrganicPet(String petName, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int happinessLevel) {
        super(petName, description);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.wellnessLevel = wellnessLevel;
        this.happinessLevel = happinessLevel;
        //        this.petName = petName;
        //        this.description = description;
    }

    public OrganicPet() {
        super();
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

    public int getHappiness() { return happinessLevel; }
    //    public String getName() {return petName; }
    //    public String getDescription() {  return description;}


    public void feedPet() {
        hungerLevel -= 20;
    }
    public void PlayWithPet() {
        boredomLevel -= 20;
    }
    public void waterPet() {
        thirstLevel -= 20;
    }
    public void takePetToVet() {
        wellnessLevel += 20;
    }
    public void makePetHappy() { happinessLevel += 20;}

    
    public int getLitterBox() {
        return 0;
    }
   public int getNeedsToBePetted() {
        return 0;
    }

    public void emptyLitterBox() {
    }

    public void needsToBePetted() {
    }

    public void catPetting() {
    }

    public void makeDogHappy() {
    }
}

//public void feedPet();  ** Use this method to leave this Method open for @Override
