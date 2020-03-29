package domaci_zadaci.klase.dete;

public class GPDete {

    public static void main (String[] args) {

        // isporobavanje to jest provera koda napisanog u klasi Dete


        Dete d1 = new Dete("Jelena", "Obradovic", 15);
        Dete d2 = new Dete("Pera", "Peric", 12);

        d1.dodajKlikere(4);
        d2.dodajKlikere(5);
        d2.dodajKlikere(4);
        d2.oduzmiKlikere(1);

        System.out.println("uk br klikera je " + Dete.ukBrKlikera);
        System.out.println("uk br dece je " + Dete.brDece);
        System.out.println("prosek br godina je " +Dete.getProsek());
        System.out.println("Broj klikera d2 je " + d2.getBrKlikera());
    }

}
