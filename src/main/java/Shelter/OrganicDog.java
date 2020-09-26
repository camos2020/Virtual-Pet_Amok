package Shelter;

public class OrganicDog extends OrganicPet implements WalkDog {

    private int cleanCageLevel;
    private int needsWalkLevel;
    //private int orgDogId =0;


    //Constructor- any changes to characteristics have to be done here.
    public OrganicDog(String petName, String description, int hungerLevel, int thirstLevel, int boredomLevel, int wellnessLevel, int cleanCageLevel, int needsWalkLevel, int happinessLevel) {
        super(petName, description, hungerLevel, thirstLevel, boredomLevel, wellnessLevel, happinessLevel);
        this.cleanCageLevel = cleanCageLevel;
        this.needsWalkLevel = needsWalkLevel;
        //orgDogId++;
    }

    public OrganicDog() {
        cleanCageLevel = 20;
        needsWalkLevel = 100;
        //orgDogId ++;
    }
            public int getCleanCageLevel() {
        return cleanCageLevel;
    }

    public int getNeedsWalkLevel() {
        return needsWalkLevel;
    }
//    public int getOrgDogId(){
//        return orgDogId;
//    }
    //public int makeDogHappy() {
        //return happinessLevel;
    //}
        

    //public int getNeedsWalk() {return needsWalkLevel;    }

        //public int getCageClean() {
            //return cleanCageLevel;}

     
        @Override
        public void walkTheDog() {
            needsWalkLevel -= 20;
        }
        public void cleanCage () {
            cleanCageLevel -= 50;
        }
        public void makeDogHappy () {
            happinessLevel += 20;
        }




//    public void walkTheDog() {
//    }

    public int getNeedsWalk() {
        return needsWalkLevel;
    }
    public int getCageClean() {
        return cleanCageLevel;
    }
    public int getHappiness() {
        return  happinessLevel;
    }

}
