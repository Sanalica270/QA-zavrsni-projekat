package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormaChrome {

	private static final String URL = "https://www.techlistic.com/p/selenium-practice-form.html";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(URL);

		wd.manage().window().maximize();

		wd.findElement(By.name("firstname")).sendKeys("Sunny");
		wd.findElement(By.name("lastname")).sendKeys("Day");

		wd.findElement(By.id("sex-1")).click();
		wd.findElement(By.id("exp-2")).click();

		wd.findElement(By.cssSelector("#datepicker")).sendKeys("mart 2020");
		wd.findElement(By.cssSelector("#profession-1")).click();

		wd.findElement(By.xpath("//input[@id='tool-2']")).click();
		wd.findElement(By.xpath("//option[contains(text(),'Europe')]")).click();

		wd.findElement(By.xpath("//option[contains(text(),'Switch Commands')]")).click();
		
		//wd.findElement(By.xpath("//input[@id='photo']")).click();
		wd.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\Kica\\Desktop\\slika.jpg");

		wd.findElement(By.xpath("//button[@id='submit']")).click();
		wd.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]")).click();

		//wd.close();
	}

}
