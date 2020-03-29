package domaci_zadaci.metode;

import java.util.Scanner;

public class Zadatak_2_0305 {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Unesi dva broja za poziciju piona");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Unesi dva broja za poziciju skakaca");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        if (x1==x2 && y1==y2)  System.out.println("Pion i skakac ne mogu da budu na istom polju");

        else if (polja(x1,y1)==false || polja(x2,y2)==false) {
            System.out.println("Greska pri unosu");
        }
        else {
            if (provera(x1,x2,y1,y2)==true)System.out.println("Jeste napadnut");
            else System.out.println("Nije napadnut");
        }

    }

    public static boolean polja(int x, int y) {
        if (x<1 || x>8 || y<1 || y>8)
            return false;
        else return true;
    }

    public static boolean provera(int x1, int x2, int y1, int y2) {
        if (x1==x2+1 && (y1==y2+1 || y1==y2-1))
            return true;
        else return false;
    }

}

