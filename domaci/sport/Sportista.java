package domaci_zadaci.klase.drugi;

public class Sportista {
    //Sportista poseduje ime, prezime i godinu rodjenja.
    // Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene.
    // Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja

    private String ime;
    private String prezime;
    private int godRodj;

    public Sportista (String ime, String prezime, int godRodj){
        this.ime = ime;
        this.prezime = prezime;
        this.godRodj = godRodj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodj() {
        return godRodj;
    }

    @Override
    public String toString(){
        return this.ime + "_"+ this.prezime + ": " + this.godRodj;
    }

}