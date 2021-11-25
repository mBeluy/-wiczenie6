public class Main {

    public static void main(String[] args) {
	    String tablica[][] = new String[3][4];

        Animal animal1 = new Animal("animal1", "12", "121");
        Animal animal2 = new Animal("animal2", "11", "114");
        Animal animal3 = new Animal("animal3", "6", "46");

        Fish fish1 = new Fish("fish1", "2", "bone");
        Fish fish2 = new Fish("fish2", "1", "bone");
        Fish fish3 = new Fish("fish3", "3", "bone");

        Blowfish blowfish1 = new Blowfish("bone","chondrichthyes");
        Blowfish blowfish2 = new Blowfish("bone","chondrichthyes");
        Blowfish blowfish3 = new Blowfish("bone","chondrichthyes");

        Bird bird1 = new Bird("bird1", "1", "red");
        Bird bird2 = new Bird("bird2", "3", "blue");
        Bird bird3 = new Bird("bird3", "2", "green");

        Pigeon pigeon1 = new Pigeon("as","2", "red", "snow pigeon");
        Pigeon pigeon2 = new Pigeon("as","2", "red", "snow pigeon");
        Pigeon pigeon3 = new Pigeon("as","2", "red", "snow pigeon");

        Mammal mammal1 = new Mammal("mammal1", "3", "blue");
        Mammal mammal2 = new Mammal("mammal2", "6", "red");
        Mammal mammal3 = new Mammal("mammal3", "4", "yellow");

        Dog dog1 = new Dog("dog1", "6", "87", "black", "samoyed");
        Dog dog2 = new Dog("dog2", "7", "65", "white", "shar-pei");
        Dog dog3 = new Dog("dog3", "8", "84", "grey", "hound");

        

    }
}
