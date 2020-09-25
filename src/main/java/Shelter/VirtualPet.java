package Shelter;

public abstract class VirtualPet {
    protected String petName;
    protected String description;

    public VirtualPet(String petName, String description) {
        this.petName = petName;
        this.description = description;
    }

    public VirtualPet() {

    }

    public String getName() {
        return petName;
    }
    public String getDescription() {
        return description;
    }
}






