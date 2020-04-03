package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import code.Summer;

public class SummerTest {
	private static final String PRODUCT = "//span[@id='layer_cart_product_title']";
	private static final String QUANTITY = "//span[@id='layer_cart_product_quantity']";
	private static final String ATRIBUTE = "//span[@id='layer_cart_product_attributes']";
	WebDriver wd;
	SoftAssert sa;

	@BeforeClass
	public void before() {
		wd = new ChromeDriver();
		sa = new SoftAssert();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void order() throws InterruptedException {

		if (wd.getCurrentUrl() != Summer.PAGE)
			Summer.openSummer(wd);
		Summer.addToCart(wd);

		sa.assertEquals(wd.findElement(By.xpath(PRODUCT)).getText(), "Printed Summer Dress");
		sa.assertEquals(wd.findElement(By.xpath(QUANTITY)).getText(), "2");
		sa.assertTrue(wd.findElement(By.xpath(ATRIBUTE)).getText().contains("M"));
		sa.assertTrue(wd.findElement(By.xpath(ATRIBUTE)).getText().contains("Blue"));

		sa.assertAll();

	}

}
