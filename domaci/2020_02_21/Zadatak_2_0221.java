package domaci_zadaci;

public class Zadatak_2_0221 {

    // Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

    public static void main(String[] args) {

        int brojac = 0;
        for (int i = 9; i <= 250; i++) {
            if (i % 3 == 0) {
                brojac++;
            }
        }
        System.out.println("Brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3 ima: " + brojac);
    }

}
