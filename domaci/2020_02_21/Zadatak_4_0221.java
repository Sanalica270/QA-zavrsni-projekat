package domaci_zadaci;

import java.util.Scanner;

public class Zadatak_4_0221 {

    // Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

    public static void main(String[] args) {

        System.out.println("Unesite koliko brojeva Fibonacijevog niza zelite da ispisete");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int  prviElNiza = 0, drugiElNiza = 1, treciElNiza = 0;

        // Fibonacijev niz pocinje sa 0 i 1.
        // sledeci element Fibonacijevog niza jednak je zbiru prethodna dva

        while (n <= 0) {
            System.out.println("Greska. broj mora biti ceo i pozitivan. Probajte ponovo");
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            treciElNiza += prviElNiza; // zbir prethodna 2 daje treci
            prviElNiza = drugiElNiza; // prvi postaje drugi clan
            drugiElNiza = treciElNiza; // drugi postaje treci clan
            System.out.print(treciElNiza + " ");

        }


    }
}
