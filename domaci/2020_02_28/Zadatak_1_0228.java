package domaci_zadaci.nizovi;

import java.util.Scanner;

public class Zadatak_1_0228 {

    // Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program ispisuje elemente niza deljive brojem br.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // napisati proveru da li je je korisnicki unos veci od 0
        System.out.println("Koliko vas niz ima elemenata?");
        int n = sc.nextInt();

        System.out.println("Elementi niza (celi brojevi) su: ");
        int[] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        System.out.println("Unesi broj za deljivost");
        int br = sc.nextInt();

        System.out.print("Elementi niza deljivi brojem " + br + " su: ");

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] % br == 0) {
                System.out.print(niz[i] + " ");



            }


        }

    }
}
