package domaci_zadaci.klase.nasledjivanje;

public class Putnik extends Covek {

    //Putnik je covek koji poseduje novac.
    // Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
    // Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

    private double money;

    public Putnik(String name, String lastName, double money) {
        super(name, lastName);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        if (money > 0) {
            this.money += money;
            System.out.println("Uspesno ste dodali novac!");
        } else
            System.out.println("Dodavanje novca nije uspelo!");
    }

    public void takeMoney(double money) {
        if (money > 0 && money < this.money) {
            this.money -= money;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(super.toString()).append(" [").append(getMoney()).append("]").toString();
    }
}
