package test;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import code.Login;
import code.Register;
import code.Summer;
import data.Data;

public class RegisterTest {
	WebDriver wd;
	SoftAssert sa;
	WebElement we;

	@BeforeClass
	public void bef() throws Exception {
		Data.getFile(Data.excellPath);
		Data.getSheet(0);
		wd = new ChromeDriver();
		sa = new SoftAssert();
		if (wd.getCurrentUrl() != Summer.PAGE)
			Summer.backToSummer(wd);
		Summer.addToCart(wd);

		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void reg1Test() throws Exception {
		Summer.proceed(wd);
		Register.regUser(wd);
		we = wd.findElement(By.xpath(Register.USER));
		sa.assertEquals(we.getText(), "Miki Maus");
		sa.assertAll();
		Login.signOut(wd);

	}

	@Test
	public void reg30Test() {
		if (wd.getCurrentUrl() != Login.LOGIN)
			Login.backToLogin(wd);

		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		for (int i = 1; i < Data.rowNumber(); i++) {

			Register.regUser(wd, i);
			we = wd.findElement(By.xpath(Register.USER));
			sa.assertEquals(we.getText(), Data.getDataAt(i, 1) + " " + Data.getDataAt(i, 2));
			Login.signOut(wd);
		}
		sa.assertAll();
	}

}
