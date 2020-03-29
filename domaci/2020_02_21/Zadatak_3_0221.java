package domaci_zadaci;

import java.util.Scanner;

public class Zadatak_3_0221 {

    // Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica

    public static void main(String[] args) {

        System.out.println("Ovaj program ispisuje sliku pravougaonika od zvezdica.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite sirinu(celi broj) pravougaonika od zvezdica: ");
        int sirina = sc.nextInt();
        while (sirina <= 0) {
            System.out.println("Sirina mora biti celi pozitivni broj. Ponovo unesite sirinu");
            sirina = sc.nextInt();
        }
        System.out.print("Upisite duzinu(celi broj) pravougaonika od zvezdica: ");
        int duzina = sc.nextInt();
        while ( duzina <= 0) {
            System.out.println("Duzina mora biti celi pozitivni broj. Ponovo unesite sirinu");
            duzina = sc.nextInt();
        }

        for (int i = 0; i < sirina; i++) {
            for (int j = 1; j < duzina; j++) {
                System.out.print("*  ");
            }
            System.out.println("*");
        }
    }
}

