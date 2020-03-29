package domaci_zadaci.klase.drugi;

public class Klub {
    //Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
    //Napisati metodu koja ce ispisati ceo objekat klase klub.

    private String naziv;
    private String sediste;
    private int godOsnivanja;
    private Sportista[] sportiste;

    public Klub(String sediste, int godOsnivanja, int n) { // int n za duzinu niza
        this.naziv = naziv;
        this.sediste = sediste;
        this.godOsnivanja = godOsnivanja;
        this.sportiste = new Sportista[n];
    }

    public String getNaziv() {
        return naziv;
    }

    public String getSediste() {
        return sediste;
    }

    public int getGodOsnivanja() {
        return godOsnivanja;
    }

    public int getBrSportista() {
        return this.sportiste.length;
    }

    public Sportista[] getSportiste() {
        return sportiste;
    }


    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean dodajSportistu(Sportista s) {

        for (int i = 0; i < sportiste.length; i++) {
            if (sportiste[i] == null) {

                sportiste[i] = s;
                return true;
            }
        }
        return false;
    }

    public boolean ukloniSportistu(Sportista s) {
        for (int i = 0; i < sportiste.length; i++) {
            if (sportiste[i] == s) {
                sportiste[i] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        String ispis = "";
        for (int i = 0; i < sportiste.length; i++) {
            ispis += sportiste[i].toString() + "\n";
        }
        return this.naziv + " " + this.sediste + " (" + this.godOsnivanja + ")\n" + "Sportisti u klubu: \n" + ispis;

    }


}
