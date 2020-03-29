package domaci_zadaci.klase.pozoriste;

public class Zaposleni {

    /*
     * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
     * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
     * sastavi tekstualni opis u obliku ime[naziv_pozorista].
     */

    private String fullName;
    private Pozoriste theatre;

    public Zaposleni(String fullName, Pozoriste theatre) {
        this.fullName = fullName;
        this.theatre = theatre;
    }

    public String getFullName() {
        return fullName;
    }

    public Pozoriste getTheatre() {
        return theatre;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(fullName).append("[").append(theatre).append("].").toString();
    }
}
