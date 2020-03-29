package domaci_zadaci.klase.treci;

import java.util.ArrayList;

public class Laptop {

    //Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja.
    // Marka moze samo da se dohvati.
    // Lista polaznika koji koriste laptop moze da se prosiri i da se smanji.
    // Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}

    private ArrayList<Polaznik> polaznici;
    private String marka;

    public Laptop(String marka) {
        polaznici = new ArrayList<Polaznik>();
        this.marka = marka;
    }


    public ArrayList<Polaznik> getPolaznika() {
        return polaznici;
    }

    public String getMarka() {
        return marka;
    }

    public void dodajPolaznika(Polaznik p) {
        this.polaznici.add(p);
    }

    @Override
    public String toString() {

        String ispis = marka + "{"; // da bi bilo lakse da se ispisu svi polaznici iz liste, uvodim promenljivu ispis
        for (int i = 0; i < polaznici.size(); i++) {
            ispis += polaznici.get(i).toString(); // na ispis (marka { ) zalepi polaznika na i-toj poziciji u listi

            if (i < polaznici.size() - 1) { // -1 kako ne bi stavljao zapetu posle poslednjeg polaznika u listi
                ispis += ", ";
            }
        }
        return ispis + " }.";
    }
}
