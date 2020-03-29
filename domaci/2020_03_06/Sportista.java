package domaci_zadaci.klase.prvi;

public class Sportista {

    //Napisati klasu Sportista. Sportista ima
    //1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
    //2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
    //3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
    //4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da se dohvati i da se postavi.
    //
    //Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.

    private String imeP;
    private String sport;
    private String klub;
    private int broj;

    public Sportista (String imeP, String sport){
        this.imeP = imeP;
        this.sport = sport;
        this.klub = klub;
        this.broj = broj;
    }

    public String getImeP() {
        return imeP;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public String toString(){
        return this.imeP+ ", " + this.sport +", " + this.klub + "_" + this.broj;
    }
}

