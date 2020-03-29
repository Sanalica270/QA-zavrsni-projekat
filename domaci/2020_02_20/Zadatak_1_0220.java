package domaci_zadaci;

import java.util.Scanner;

public class Zadatak_1_0220 {

    //Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n
    // - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu vrstu petlje, vec samo jednu petlju).
    // podrazumeva se da se n ucitava preko standardnog ulaza

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj do kog ce se racunati zbir i proizvod prirodnih brojeva");
        int n = sc.nextInt();

        int zbir = 0; // nula ne utice na sabiranje, zato je neutralni clan
        int proizvod = 1; // 1 ne utice na mnozenje, zato je neutralni clan

        for (int i = 0; i<=n; i++){ // nije naglaseno da li n treba da se uracuna, moj izbor je da treba, nije greska ako je i < n
            if (i%2==0) zbir  += i;
            else proizvod *= i;

        }
        System.out.println("Zbir parnih brojeva od 0 do " + n + " je " + zbir + " .");
        System.out.println("Proizvod neparnih brojeva od 0 do " + n + " je " + proizvod + " .");


    }
}
