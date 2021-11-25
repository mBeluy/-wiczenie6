public class Fish extends Animal{
    private String family;

    @Override
    public void eat(){
        System.out.println("EATING INSECTS");
    }

    @Override
    public void getVoice(){
        System.out.println("SOME FISH SOUND");
    }

    public Fish(String family) {
        this.family = family;
    }

    public Fish(){

    }

    public Fish(String name, String age, String weight, String family) {
        super(name, age, weight);
        this.family = family;
    }

    public Fish(String name, String age, String family) {
        super(name, age);
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "family='" + family + '\'' +
                '}';
    }
}
