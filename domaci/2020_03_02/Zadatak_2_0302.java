package domaci_zadaci.nizovi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2_0302 {

    //Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza
    // koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n:");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj. Ponovo unesite duzinu niza");
            n = sc.nextInt();
        }

        int[] brojevi = new int[n];


        unosNiza(brojevi, sc);
        ispisClanova(brojevi);
        proizvodClanova(brojevi);
    }


    public static void unosNiza(int[] niz, Scanner sc) {

        System.out.println("Unesite element niza");
        for (int i = 0; i < niz.length; i++) {

            niz[i] = sc.nextInt();
        }
    }

    private static void proizvodClanova(int[] niz) {
        int multi = 1, brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > i) {
                multi *= niz[i];
                brojac++;
            }
        }
        if (brojac == 0)
            System.out.println("Nema clanova koji su veci od svog indexa, stoga ne racunamo proizvod.");
        else
            System.out.println("Proizvod clanova koji su veci od svog indexa je: " + multi);
    }

    private static void ispisClanova(int[] niz) {
        System.out.println("Clanovi takvog niza koji su veci od svog indexa su: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > i) System.out.print(niz[i] + " ");
        }
    }


}






