package domaci_zadaci.klase.pozoriste;

public class Glumac extends Zaposleni {

    /*
     * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
     * uloga_ime[naziv_pozorista].
     */

    private String role;

    public Glumac(String fullName, Pozoriste theatre, String role) {
        super(fullName, theatre);
        this.role = role;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(role).append("_").append(super.toString()).toString();
    }
}
