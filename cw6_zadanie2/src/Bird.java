public class Bird extends Animal{
    private String featherColor;

    @Override
    public void eat() {
        System.out.println("EATING INSECTS");
    }

    @Override
    public void getVoice(){
        System.out.println("CHIRP");
    }

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public Bird(String name, String age, String weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(){

    }

    public Bird(String name, String age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
