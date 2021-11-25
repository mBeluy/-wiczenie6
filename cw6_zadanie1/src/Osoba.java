public class Osoba {
    private String nazwisko, imię, ulica, kod, miasto;
    public void drukuj(){
        System.out.println("NAZWISKO: " + nazwisko);
        System.out.println("IMIĘ: " + imię);
        System.out.println("ULICA: " + ulica);
        System.out.println("KOD: " + kod);
        System.out.println("MIASTO: " + miasto);
    }

    public void inicjuj(String nazwisko, String imię, String ulica, String kod, String miasto){
        this.nazwisko = nazwisko;
        this.imię = imię;
        this.ulica = ulica;
        this.kod = kod;
        this.miasto = miasto;
    }

}
