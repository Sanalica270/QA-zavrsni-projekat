package Selenium;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://itbootcamp.rs/");

        driver.manage().window().maximize();
        metoda(driver);

        driver.close();
    }


    public static void metoda(WebDriver driver) {
        TakesScreenshot scrSh = ((TakesScreenshot) driver);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("./Selenium/ScreenShot/ScrSh2.png"));
            System.out.println("Napravljen scrsh.");
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
