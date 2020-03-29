package domaci_zadaci.klase.dete;

public class Dete {

    //Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se kreira vise objekata klase Dete.
    // Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
    //Napraviti metodu koja ce ispisivati broj klikera  i metodu koja ispisuje prosecan broj decjih godina.

    public static int ukBrKlikera;  // staticko polje jer pripada klasi a ne nekom specificnom objektu dete
    public static int brDece; // staticko polje jer pripada klasi a ne nekom specificnom objektu dete
    public static double ukBrGod; // staticko polje jer pripada klasi a ne nekom specificnom objektu dete
    private String ime;
    private String prezime;
    private int brGod;
    private int brKlikera;

    public Dete(String ime, String prezime, int brGod){  // br klikera ne spominjem, jer je po defaultu to namesteno na 0
        this.ime = ime;
        this.prezime = prezime;
        this.brGod = brGod;
        brDece++;
        ukBrGod +=this.brGod;
    }

    public static double getProsek(){ // staticka metoda za staticko polje
        return ukBrGod / brDece;
    }

    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public int getBrGod(){
        return brGod;
    }
    public int getBrKlikera(){
        return brKlikera;
    }
    public int getUkBrKlikera(){
        return ukBrKlikera;
    }
    public void dodajKlikere(int brKlikera){
        this.brKlikera += brKlikera;
        ukBrKlikera+= brKlikera;
    }
    public void oduzmiKlikere(int brKlikera){
        this.brKlikera -= brKlikera;
        ukBrKlikera -= brKlikera;
    }
}
// u kodu za oduzmi klikere treba postaviti uslov da ne moze da se oduzme br klikera ukoliko je on veci od broja klikera koje dete poseduje.

// u kodu mozete napisati i uslove da ne moze da se doda -5 klikera, niti moze da se oduzme -5 klikera

// isti princip za br godina dece

