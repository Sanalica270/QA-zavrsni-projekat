package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Summer {

	public static final String PAGE = "http://automationpractice.com/index.php?id_category=11&controller=category";
	private static final String FIRST = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	private static final String SIZE_M = "//option[contains(text(),'M')]";
	private static final String BLUE = "//a[@id='color_14']";
	private static final String ADD = "//a[@class='btn btn-default button-plus product_quantity_up']//span";
	private static final String TO_CART = "//span[contains(text(),'Add to cart')]";
	private static final String PROCEED1 = "//span[contains(text(),'Proceed to checkout')]";
	private static final String PROCEED2 = "//a[@class='button btn btn-default standard-checkout button-medium']";

	public static void addToCart(WebDriver wd) throws InterruptedException {

		Thread.sleep(5000);
		wd.findElement(By.xpath(FIRST)).click();
		wd.findElement(By.xpath(ADD)).click();
		wd.findElement(By.xpath(BLUE)).click();
		wd.findElement(By.xpath(SIZE_M)).click();
		wd.findElement(By.xpath(TO_CART)).click();

	}

	public static void proceed(WebDriver wd) {

		wd.findElement(By.xpath(PROCEED1)).click();
		wd.findElement(By.xpath(PROCEED2)).click();
	}

	public static void openSummer(WebDriver wd) {
		wd.get(PAGE);
	}

	public static void backToSummer(WebDriver wd) {
		wd.navigate().to(PAGE);
	}

}
