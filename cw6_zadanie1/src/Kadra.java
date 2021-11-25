public class Kadra extends Osoba{
    private String wykształcenie, stanowisko;
    public void inicjuj1(String nazwisko, String imię, String ulica, String kod, String miasto, String wykształcenie, String stanowisko){
        inicjuj(nazwisko, imię, ulica, kod, miasto);
        this.wykształcenie = wykształcenie;
        this.stanowisko = stanowisko;
    }
    public void drukuj1(){
        drukuj();
        System.out.println("WYKSZTAŁCENIE: " + wykształcenie);
        System.out.println("STANOWISKO: " + stanowisko);
    }
}
