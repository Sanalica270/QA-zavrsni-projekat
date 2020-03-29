package domaci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class PustiPesmu {

	private static final String URL = "https://www.youtube.com";

	public static void sacekaj() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.opera.driver", "operadriver.exe");
		WebDriver wd = new OperaDriver();

		wd.get(URL);

		wd.findElement(By.id("search")).sendKeys("Rick Astley");

		wd.findElement(By.cssSelector("#search-icon-legacy")).click();
		sacekaj();
		wd.findElement(By.xpath("//yt-formatted-string[contains(text(),'Never')]")).click();

		sacekaj();

		wd.findElement(By.xpath("//a[@class='ytp-next-button ytp-button']")).click();

		// wd.findElement(By.partialLinkText("Skip Ad")).click();

		// wd.findElement(By.className("ytp-ad-skip-button ytp-button")).click();

		// wd.findElement(By.className("video-ads.ytp-ad-module")).clear();
		// wd.close();
	}

}
