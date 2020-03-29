package domaci_zadaci.nizovi;

import java.util.Scanner;

public class Zadatak_3_0228 {

    //Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
    //Primer1 niza: 3 54 123 18
    //Ispis: Niz nije rastuci.
    //Primer2 niza: 71 422 1001 5054
    //Ispis: Niz je rastuci.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("N?");

        //napisati proveru da je korisnicki unos veci od 0
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] >= niz[i + 1]) {
                System.out.println("Niz nije rastuci.");
                break;
            }
        }
        System.out.println("Niz je rastuci.");
    }
}
