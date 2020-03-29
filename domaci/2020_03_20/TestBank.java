package domaci_zadaci.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBank {

    //Potrebno je napraviti test za ispravnost klase Bank.
    // Za sve testove potrebno je napraviti jedinstvenu banku koja se na početku testa resetuje.
    // Smatrati da ova banka ne može da ima nalog kod kojeg je stanje negativno.
    // Ako se na osnovu testova nađe neka greška u kodu potrebno jej da se popravi originalni kod.
    //
    //Potrebno je ispitati da li adekvatno radi otvaranje naloga, tako što će se ubaciti 5 naloga i zatim ispitati da li se ti nalozi mogu dohvatiti.
    //Proveriti da li dobro radi metoda za uplatu novca.
    //Proveriti da li dobro radi metoda za transfer novca.
    //Proveriti da li dobro radi metoda za računanje ukupnog novca u banci (getSumMoney).


    @Test
    public void proveraTransfera() {

        Bank Erste = new Bank();
        Account predrag = Erste.openAccount("Predrag");
        Account nenad = Erste.openAccount("Nenad");
        Erste.payInMoney(nenad.getNumber(), 10000.0);
        Erste.transferMoney(nenad.getNumber(), predrag.getNumber(), 3000.0);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(predrag.getAmount(), 3000.0);
        sa.assertEquals(nenad.getAmount(), 7000.0);

        sa.assertAll();
    }

    @Test
    public void testGetSumMoney () {
        Bank b = new Bank();
        Account acct1 = b.openAccount("Maja");
        Account acct2 = b.openAccount("Irena");
        b.payInMoney(acct1.getNumber(), 500.0);
        b.payInMoney(acct2.getNumber(), 5000.0);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(b.getSumMoney(), 5500.0);
        sa.assertAll();
    }
}
