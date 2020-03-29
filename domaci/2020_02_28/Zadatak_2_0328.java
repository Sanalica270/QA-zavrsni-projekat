package domaci_zadaci.nizovi;

import java.util.Scanner;

public class Zadatak_2_0328 {
    //Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
    //Primer niza: 3 54 123 18
    //Ispis: 18 123 54 32

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("N?");

        //napisati proveru da je korisnicki unos veci od 0
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i< niz.length; i++){
            niz[i] = sc.nextInt();
        }

        for (int i = niz.length -1; i >= 0; i--){
            System.out.println(niz[i]);

        }

    }
}
