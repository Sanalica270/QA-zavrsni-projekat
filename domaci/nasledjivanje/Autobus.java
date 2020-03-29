package domaci_zadaci.klase.nasledjivanje;

public class Autobus {

    //Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze.
    // Naziv i cena karte i zadaju se prilikom kreiranja.
    // Moguce je dodati/ukloniti putnika kao i vozaca.
    // Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.
    //Autobus ispisati u sledecem obliku:
    //Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )

    private String name;
    private Vozac driver;
    private double price;
    private Putnik[] passengers;
    private int passNumb = 0;

    public Autobus(String name, double price, int n) {
        this.name = name;
        this.price = price;
        passengers = new Putnik[n];
    }

    public String getName() {
        return name;
    }

    public void addDriver(Vozac driver) {
        this.driver = driver;
    }

    public void removeDriver(Vozac driver) {
        if (this.driver == driver) {
            this.driver = null;
            System.out.println("Vozac uklonjen!");
        } else
            System.out.println("Nemoguce ukloniti ovog vozaca, ne nalazi se u autobusu!");
    }

    public void addPassenger(Putnik passenger) {
        int i;
        for (i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                System.out.println("Putnik je usao u autobus!");
                this.passNumb++;
                break;
            }
        }
        if (this.passNumb == passengers.length && i == passengers.length) {
            System.out.println("Nema vise mesta u autobusu!");

        }
    }

    public void removePassenger(Putnik passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == passenger) {
                passengers[i] = null;
                System.out.println("Putnik je izasao iz autobusa!");
                break;
            }
            if (passengers[i] != passenger && i == (passengers.length - 1)) {
                System.out.println("Ovaj putnik ne moze da izadje posto nije u autobusu!");
            }
        }
    }

    public void chargeTicket() {
        this.passNumb = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (driver == null) {
                System.out.println("Nemoguce naplatiti karte, vozac nije u autobusu!");
                break;
            }
            if (passengers[i] != null && driver != null) {
                if (passengers[i].getMoney() > this.price) {
                    passengers[i].takeMoney(this.price);
                    this.passNumb++;
                } else {
                    passengers[i] = null;
                    System.out.println("Putnik nema dovoljno para za kartu i izasao je iz autobusa!");
                }
            }
        }
        if (this.passNumb != 0 && driver != null) {
            System.out.println("Putnicima u autobusu su naplacene karte!");
        }
        if (this.passNumb == 0 && driver != null) {
            System.out.println("Karte nisu naplacene, nema putnika u autobusu!");
        }
    }

    @Override
    public String toString() {
        passNumb = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" (");
        if (this.driver != null) {
            sb.append(this.driver).append(" - ");
        } else {
            sb.append("Nema vozaca u autobusu. ");
        }
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                if (i != (passengers.length - 1) && passNumb != 0) {
                    sb.append(", ");
                }
                sb.append(passengers[i].toString());
                passNumb++;
            }
        }
        if (passNumb == 0) {
            sb.append("Nema putnika u autobusu");
        }
        sb.append(" )");

        return sb.toString();
    }
}
