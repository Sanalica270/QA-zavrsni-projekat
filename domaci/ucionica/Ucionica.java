package domaci_zadaci.klase.treci;

public class Ucionica {

    public static void main (String [] args){

        // isporobavanje to jest provera koda napisanog u klasama polaznik i laptop

        // kreiranje 4 polaznika -> broj kreiranih polaznika je slobodan izbor
        Polaznik p1 = new Polaznik("Jelena", "Obradovic");
        Polaznik p2 = new Polaznik("Pera", "Peric");
        Polaznik p3 = new Polaznik("Mirko", "Mirkovic");
        Polaznik p4 = new Polaznik("Janko", "Jankovic");


        //kreiranje 3 laptopa -> broj kreiranih je slobodan izbor
        Laptop l1 = new Laptop("Lenovo");
        Laptop l2 = new Laptop("HP");
        Laptop l3 = new Laptop("Dell");


        //dodavanje korisnika koji koriste laptop 2
        l2.dodajPolaznika(p2);

        // dodavanje korisnika koji koriste laptop 3
        l3.dodajPolaznika(p1);
        l3.dodajPolaznika(p3);
        l3.dodajPolaznika(p4);


        // ispis laptopa 2 i 3
        System.out.println(l2.toString());
        System.out.println(l3.toString());


    }


}

