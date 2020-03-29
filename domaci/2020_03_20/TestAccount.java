package domaci_zadaci.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAccount {

    // Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente,
    // kao i da li get metode vraćaju odgovarajuće vrednosti. Kada se napravi račun, stanje treba da bude jednako 0.

    //Proveriti da li set metode dobro postavljaju odgovarajuće vrednosti,
    // kao i da li get metode vraćaju odgovarajuće vrednosti.

    //Proveriti da li je ispravan format ispisa jednog Account-a.
    // Očekivani format ispisa: broj<tab>ime<tab>stanje.
    // Stanje treba da bude zaokruženo na dve decimale.

    //Napraviti 100 000 naloga pomoću konstruktora public Account(String name) i proveriti da li se svi brojevi razlikuju.

    @Test
    public void testKonstruktor() {
        String ime = "Zlatko", brojRacuna = "0001";
        double pocVrednost = 0;
        Account acc = new Account(ime, brojRacuna);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(acc.getName(), ime, "Pogresno ime unutar kons ili getera");
        sa.assertEquals(acc.getNumber(), brojRacuna, "Pogresan broj racuna");
        sa.assertEquals(acc.getAmount(), pocVrednost, "Losa pocetna vrednost");
        sa.assertAll();

    }

    @Test
    public void testGetSet() {
        String ime = "Zlatko", brojRacuna = "0001";
        double pocVrednost = 0, novaVr = 150000;

        Account acc = new Account(ime, brojRacuna);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(acc.getName(), ime, "Pogresno ime unutar kons ili getera");
        sa.assertEquals(acc.getNumber(), brojRacuna, "Pogresan broj racuna");
        sa.assertEquals(acc.getAmount(), pocVrednost, "Losa pocetna vrednost");
        sa.assertAll();

        acc.setAmount(novaVr);
        Double vred = novaVr;
        Assert.assertEquals(acc.getAmount(), vred, "Lose postavljeno");

    }

    @Test
    public void testNaloga() {
        int MAX=100;
        Account[] nalozi = new Account[MAX];

        for (int i = 0; i < nalozi.length; i++) {

            nalozi[i] = new Account("Nalog" + i);
        }

        for (int i = 0; i < nalozi.length; i++) {
            for (int j = i + 1; j < nalozi.length; j++) {
                Assert.assertNotEquals(nalozi[i].getNumber(), nalozi[j].getNumber());
            }
        }
    }
    @Test
    public void testIspis() {
        String ime="Dusan",broj="0001";
        Account acc= new Account(ime,broj);
        Assert.assertEquals(acc.toString(), String.format("%s\t%s\t%.2f",acc.getNumber(),acc.getName(),acc.getAmount()));
    }
}
