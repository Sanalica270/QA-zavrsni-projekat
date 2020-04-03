package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import code.Home;
import code.Summer;

public class HomeTest {
	SoftAssert sa;
	WebDriver wd;
	WebElement we;
	Actions action;

	String url1;
	String url2;

	@BeforeClass
	public void before() {

		wd = new ChromeDriver();
		sa = new SoftAssert();
		action = new Actions(wd);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		Home.openHome(wd);

		we = wd.findElement(By.xpath(Home.WOMEN));

		action.moveToElement(we).perform();

		wd.findElement(By.xpath(Home.SUMMER1)).click();
		url1 = wd.getCurrentUrl();
		sa.assertEquals(url1, Summer.PAGE);
		sa.assertAll();
	}

	@Test
	public void test2() {
		Home.backToHome(wd);

		we = wd.findElement(By.xpath(Home.DRESSES));

		action.moveToElement(we).perform();

		wd.findElement(By.xpath(Home.SUMMER2)).click();
		url2 = wd.getCurrentUrl();
		sa.assertEquals(url2, Summer.PAGE);
		sa.assertAll();
	}

	@Test
	public void test3() {
		sa.assertEquals(url1, url2);
		sa.assertAll();
	}

	@AfterClass
	public void afterTest() {
		we.clear();
	}

}
