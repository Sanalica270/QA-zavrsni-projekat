package domaci_zadaci;

import java.util.Scanner;

public class Zadatak_2_0220 {

    // Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
    // i ispisuje njihov zbir (zbir pozitivnih brojeva).
    // primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Program sabira sve unete pozitivne brojeve. Za izlazak iz programa unesi negativan broj");

        // nije naglaseno da li brojevi treba da budu celi ili realni, biram cele

        int broj, zbir = 0;

        broj = sc.nextInt();

        while (broj >= 0) {
            zbir += broj;
            broj = sc.nextInt();
        }
        System.out.println("Zbir unesenih pozitivnih brojeva je: " + zbir + ".");
    }

}


