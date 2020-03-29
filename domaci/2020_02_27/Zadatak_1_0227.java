package domaci_zadaci.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

    // Pomocu jave i seleniuma
    //Otvoriti novi prozor u pretrazivacu i otici na IT Bootcamp
    //Primeniti metode koje smo vezbali na casu (get URL i Title, navigate - refresh, to, back, forward)
    //U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )

    //Dodatni neobavezni zadatak
    //Nadji metodu kojom ces vratiti duzinu “naslova”, ne samo naslov

    public static void main (String[] args){


        WebDriver driver  = new ChromeDriver();


        Dimension velicina = driver.manage().window().getSize();
        System.out.println(velicina);

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle().length());

        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://itbootcamp.rs/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.manage().window().setSize(velicina);
        System.out.println(velicina);

        driver.close();

    }


}
