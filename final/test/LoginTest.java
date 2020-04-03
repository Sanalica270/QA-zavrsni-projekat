package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import code.Login;
import data.Data;

public class LoginTest {
	WebDriver wd;
	SoftAssert sa;

	@BeforeClass
	public void before() {
		Data.getFile(Data.excellPath);
		Data.getSheet(0);
		wd = new ChromeDriver();
		sa = new SoftAssert();
	}

	@Test
	public void testLogin() {

		if (wd.getCurrentUrl() != Login.LOGIN)
			Login.backToLogin(wd);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (int i = 1; i < Data.rowNumber(); i++) {
			Login.login(wd, i);

			sa.assertTrue((wd.findElement(By.xpath(Login.SIGN_OUT)).isDisplayed()));
			Login.signOut(wd);
		}
		sa.assertAll();

	}

}
