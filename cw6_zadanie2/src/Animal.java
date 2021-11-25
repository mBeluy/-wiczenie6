public class Animal {
    private String name, age, weight;
    public void eat(){
        System.out.println("EATING SOMETHING");
    }
    public void getVoice(){
        System.out.println("SOME SOUND");
    }

    public Animal() {

    }

    public Animal(String name, String age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
