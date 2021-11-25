public class Blowfish extends Fish{
    private String group;

    @Override
    public void eat(){
        System.out.println("EATS PLANKTON");
    }

    @Override
    public void getVoice(){
        System.out.println("SOME BLOWFISH SOUND");
    }

    public void swim(){
        System.out.println("SWIM");
    }

    public Blowfish(String family, String group) {
        super(family);
        this.group = group;
    }

    public Blowfish(){

    }

    public Blowfish(String name, String age, String weight, String family, String group) {
        super(name, age, weight, family);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "group='" + group + '\'' +
                '}';
    }
}
