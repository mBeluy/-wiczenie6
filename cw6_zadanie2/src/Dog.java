public class Dog extends Mammal{
    private String breed;

    @Override
    public void eat(){
        System.out.println("EATTING PORK");
    }

    @Override
    public void getVoice(){
        System.out.println("WOOF-WOOF");
    }

    public void jump(){
        System.out.println("JUMP");
    }

    public Dog(String skinColor, String breed) {
        super(skinColor);
        this.breed = breed;
    }

    public Dog(){

    }

    public Dog(String name, String age, String weight, String skinColor, String breed) {
        super(name, age, weight, skinColor);
        this.breed = breed;
    }

    public Dog(String name, String age, String skinColor, String breed) {
        super(name, age, skinColor);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
