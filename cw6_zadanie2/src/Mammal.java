public class Mammal extends Animal{
    private String skinColor;

    @Override
    public void eat(){
        System.out.println("EATTING MEAT");
    }

    @Override
    public void getVoice(){
        System.out.println("'SOME MAMMALS SOUND'");
    }

    public Mammal(String skinColor) {
        this.skinColor = skinColor;
    }

    public Mammal(String name, String age, String weight, String skinColor) {
        super(name, age, weight);
        this.skinColor = skinColor;
    }

    public Mammal(){

    }

    public Mammal(String name, String age, String skinColor) {
        super(name, age);
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "skinColor='" + skinColor + '\'' +
                '}';
    }
}
