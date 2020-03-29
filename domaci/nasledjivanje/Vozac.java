package domaci_zadaci.klase.nasledjivanje;

public class Vozac extends Covek {

    //Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

    private String proffesion;

    public Vozac(String name, String lastName) {
        super(name, lastName);
        this.proffesion = "sofer";
    }

    public String getProffesion() {
        return proffesion;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(proffesion.toUpperCase()).append(": ").append(super.toString()).toString();
    }
}
