package domaci_zadaci.klase.nasledjivanje;

public class GlavniProgram {

    public static void main(String[] args) {

        Autobus a1 = new Autobus("Lasta", 80, 30);
        Autobus a2 = new Autobus("E30", 100, 3);

        Vozac v1=new Vozac("Mika", "Mikic");
        Vozac v2=new Vozac("Laza", "Lazic");

        Putnik p1 = new Putnik ("Zika", "Zikic", 100);
        Putnik p2 = new Putnik ("Pera", "Peric", 250);
        Putnik p3 = new Putnik ("Marko", "Markovic", 50);
        Putnik p4 = new Putnik ("Janko", "Jankovic", 200);
        Putnik p5 = new Putnik ("Jana", "Jankovic", 500);
        Putnik p6 = new Putnik ("Mirko", "Mirkovic", 250);
        Putnik p7 = new Putnik ("Mara", "Maric", 200);
        Putnik p8 = new Putnik ("Sara", "Saric", 700);

        a1.addDriver(v1);
        a1.chargeTicket();

        a2.chargeTicket();
        a2.addDriver(v2);

        a2.addPassenger(p1);
        a2.addPassenger(p2);
        a2.addPassenger(p3);
        a2.addPassenger(p4);
        a2.chargeTicket();
        a2.removePassenger(p6);
        a2.addPassenger(p6);
        a2.removePassenger(p6);
        a2.removeDriver(v2);

        System.out.println(p2);
        System.out.println(a2);
        System.out.println(a1);
        System.out.println(v1);
    }
}
