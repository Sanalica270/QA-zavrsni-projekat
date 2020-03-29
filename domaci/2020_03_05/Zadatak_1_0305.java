package domaci_zadaci.metode;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_0305 {

    //Napisati program koji ce na standarnom izlazu ispisati poruku
    //“Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom).
    //Korisnik unosi int []

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza:");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj. Ponovo unesite duzinu niza");
            n = sc.nextInt();
        }
        int[] niz = new int[n];

        unosNiza(niz, sc);
        System.out.println(palindrom(niz));
    }


    public static void unosNiza(int[] niz, Scanner sc) {

        System.out.println("Unesite sve elemente niza");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
    }


    public static String palindrom(int[] niz) {
        String palindrom = "";
        for (int i = 0, j = niz.length - 1; i <= j / 2; i++, j--) {

            if (niz[i] != niz[j]) {
                palindrom = "Nije palindrom";
                return palindrom;

            } else palindrom = "Jeste palindrom";
        }

        return palindrom;
    }

}
