package domaci_zadaci;

import java.util.Scanner;

public class Zadatak_1_0221 {

    //Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
    //
    //0 - Izlaz iz programa
    //1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
    //2 - naplata racuna
    //
    //Ukoliko korisnik unese opciju 0 program se zavrsava.
    //Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
    //Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
    //Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
    //	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcija;
        double racun = 0, kupovina = 0;

        do {
            System.out.println("***KASA***");
            System.out.println("Trenutna cena odabranih proizvoda iznosi: " + racun + " din.");
            System.out.println("Odaberite operaciju:");
            System.out.println("  1) Kupovina novog proizvoda");
            System.out.println("  2) Naplata racuna");
            System.out.println("  0) Zatvaranje kase");
            opcija = sc.nextInt();

            switch (opcija) {
                case 1:
                    System.out.println("Unesite cenu novog proizvoda:");
                    kupovina = sc.nextDouble();
                    while (kupovina <= 0) {
                        System.out.println("Nemamo besplatnih proizvoda, niti Vam placamo da uzmete neke od nasih proizvoda.");
                        System.out.println("Unesite cenu proizvoda:");
                        kupovina = sc.nextInt();
                    }
                    racun += kupovina;
                    break;
                case 2:
                    System.out.println("Vas racun iznosi " + racun + " din. Molimo unesite koliko novca stavljate u kasu:");
                    int naplata = sc.nextInt();
                    while (naplata < racun) {
                        System.out.println("Vas iznos ne pokriva troskove racuna: " + racun + " din. Molimo Vas ponovo unesite koliko novca dajete:");
                        naplata = sc.nextInt();
                    }
                    System.out.println("Hvala. Vas kusur iznosi " + (naplata - racun) + " din. Dodjite nam opet! \n");
                    racun = 0;
                    break;
                case 0:
                    if (racun > 0) {
                        System.out.println("Vas racun nije naplacen. Morate da platite racun");
                        naplata = sc.nextInt();
                        if (opcija != 0) {
                            break;
                        }
                    }
                    System.out.println("Kasa se gasi. Izlazak iz programa.");
                    break;
                default:
                    System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih operacija.");
                    break;
            }
        } while (opcija != 0);

    }


}

