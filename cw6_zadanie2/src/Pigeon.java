public class Pigeon extends Bird{
    private String species;

    @Override
    public void eat(){
        System.out.println("EATS MOSQUITOS");
    }

    @Override
    public void getVoice(){
        System.out.println("CHIRP-CHIRP");
    }

    public void fly(){
        System.out.println("FLY");
    }

    public Pigeon(String featherColor, String species) {
        super(featherColor);
        this.species = species;
    }

    public Pigeon(String name, String age, String weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(){

    }

    public Pigeon(String name, String age, String featherColor, String species) {
        super(name, age, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }
}
