package code;

import org.openqa.selenium.WebDriver;

public class Home {

	public static final String HOME = "http://automationpractice.com/index.php";
	public static final String DRESSES = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
	public static final String WOMEN = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public static final String SUMMER1 = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";
	public static final String SUMMER2 = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]";

	public static void openHome(WebDriver wd) {
		wd.get(HOME);
	}

	public static void backToHome(WebDriver wd) {
		if (!wd.getCurrentUrl().equals(Home.HOME)) {
			wd.navigate().to(HOME);
		}

	}

}
