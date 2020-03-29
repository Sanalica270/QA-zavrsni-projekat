package domaci_zadaci.klase.nasledjivanje;

public class Covek {

//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
// Svi podaci mogu da se dohvate, ali ne i postave.

    private String name;
    private String lastName;

    public Covek(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(getName()).append("_").append(getLastName()).toString();
    }
}
