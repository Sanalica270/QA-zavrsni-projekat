package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import data.Data;

public class Login {

	public static final String LOGIN = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public static final String SIGN_OUT = "//a[@class='logout']";
	public static final String SIGN_IN = "//p[@class='submit']//span[1]";
	private static final String EMAIL = "//input[@id='email']";
	private static final String PASS = "//input[@id='passwd']";

	public static void goToLogin(WebDriver wd) {
		wd.get(LOGIN);
	}

	public static void backToLogin(WebDriver wd) {
		wd.navigate().to(LOGIN);
	}

	public static void login(WebDriver wd, int i) {
		wd.findElement(By.xpath(EMAIL)).sendKeys(Data.getDataAt(i, 3));
		wd.findElement(By.xpath(PASS)).sendKeys(Data.getDataAt(i, 4));
		wd.findElement(By.xpath(SIGN_IN)).click();
	}

	public static boolean signOut(WebDriver wd) {
		if (wd.findElement(By.xpath(SIGN_OUT)).isDisplayed()) {
			wd.findElement(By.xpath(SIGN_OUT)).click();
		}
		return true;

	}

	public static void loginUsers(WebDriver wd) {
		for (int i = 1; i < Data.rowNumber(); i++) {
			if (!Login.signOut(wd)) {
				Login.signOut(wd);
			}
			login(wd, i);
		}

	}
}
