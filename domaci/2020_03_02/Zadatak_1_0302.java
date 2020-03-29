package domaci_zadaci.nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_0302 {

    //Napisati program koji ce na standarnom izlazu ispisati poruku
    //“Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom).
    //Korisnik unosi int []

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza:");
        int n = sc.nextInt();

        // while pisem pre inicijalizacije niza, kako mi program ne bi bio pukao zbog izuzetka za negativnu duzinu niza
        while (n <= 0) {
            System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj. Ponovo unesite duzinu niza");
            n = sc.nextInt();
        }

        int[] niz = new int[n];

        boolean palindrom = false; // indikator da li su elementi jednaki, to jest da li je niz palindrom


        System.out.println("Unesite sve elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0, j = niz.length - 1; i <= j / 2; i++, j--) { // nema potrebe da prolazim kroz ceo niz, to jest da uslov bude i<=j,
                                                                    // jer prolazim kroz niz istovremeno s leva nadesno i s desna nalevo
                                                                    // (spolja ka unutra)
                                                                    // sto znaci da je dovoljno da stavim za uslov j/2

            if (niz[i] != niz[j]) { // uporedjivanje prvog i poslednjeg elementa u nizu, pa drugog i pretposlednjeg itd..

                palindrom = false; // ako elementi na tim pozicijama nisu jednaki
                System.out.println("Niz nije palindrom."); // odmah mi ispisi poruku
                break; // i izadji iz petlje jer je dalja provera nepotrebna
            }
        }

        if (palindrom == true) System.out.println("Niz jeste palindrom.");
        System.out.println(Arrays.toString(niz));

    }

}
