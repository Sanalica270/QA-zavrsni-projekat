package code;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import data.Data;

public class Register {

	private static final String EMAIL = "//input[@id='email_create']";
	private static final String CREATE_ACCOUNT = "//button[@id='SubmitCreate']";

	private static final String FIRST_NAME = "//input[@id='customer_firstname']";
	private static final String LAST_NAME = "//input[@id='customer_lastname']";
	// private static final String EMAIL2 = "//input[@id='email']";
	private static final String PASS = "//input[@id='passwd']";

	private static final String ADDRESS = " //input[@id='address1']";
	private static final String CITY = "//input[@id='city']";
	public static final String STATE = "//option[contains(text(),'California')]";
	private static final String POSTAL = "//input[@id='postcode']";
	private static final String COUNTRY = "//option[contains(text(),'United States')]";
	private static final String MOB = "//input[@id='phone_mobile']";

	private static final String REGISTER = "//span[contains(text(),'Register')]";
	public static final String USER = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]/span[1]";

	public static void inputEmail(WebDriver driver) {
		WebElement el = driver.findElement(By.xpath(EMAIL));
		el.click();
		Random random = new Random();
		int randomInt = random.nextInt(100);
		el.sendKeys("sanalica" + randomInt + "@outlook27.com");
	}

	public static void regUser(WebDriver wd) {
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		inputEmail(wd);
		clickCreateAccount(wd);
		inputFirstName(wd, "Miki");
		inputLastName(wd, "Maus");
		inputPass(wd, "12345");
		inputAddress(wd, "Zmaj Jovina");
		inputCity(wd, "Va");
		state(wd);
		inputPostalcode(wd, "12345");
		country(wd);
		inputMob(wd, "12345");
		clickRegBtn(wd);
	}

	public static void regUser(WebDriver wd, int i) {
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		inputEmail(wd, Data.getDataAt(i, 3));
		clickCreateAccount(wd);
		inputFirstName(wd, Data.getDataAt(i, 1));
		inputLastName(wd, Data.getDataAt(i, 2));
		inputPass(wd, Data.getDataAt(i, 4));
		inputAddress(wd, Data.getDataAt(i, 7));
		inputCity(wd, Data.getDataAt(i, 8));
		state(wd, i);
		inputPostalcode(wd, Data.getDataAt(i, 9));
		country(wd);
		inputMob(wd, Data.getDataAt(i, 10));
		clickRegBtn(wd);
	}

	public static void regUsers(WebDriver wd) {

		for (int i = 1; i < Data.rowNumber(); i++) {
			if (!Login.signOut(wd)) {
				Login.signOut(wd);
			}
			regUser(wd, i);
		}
	}

	public static void inputEmail(WebDriver wd, String email) {
		wd.findElement(By.xpath(EMAIL)).sendKeys(email);

	}

	public static void state(WebDriver wd, int i) {
		wd.findElement(By.xpath("//option[contains(text(), '" + Data.getDataAt(i, 6) + "')]")).click();
	}

	public static void state(WebDriver wd) {
		wd.findElement(By.xpath(STATE)).click();
	}

	public static void clickCreateAccount(WebDriver wd) {
		wd.findElement(By.xpath(CREATE_ACCOUNT)).click();
	}

	public static void inputFirstName(WebDriver wd, String firstname) {
		wd.findElement(By.xpath(FIRST_NAME)).sendKeys(firstname);

	}

	public static void inputLastName(WebDriver wd, String lastname) {
		wd.findElement(By.xpath(LAST_NAME)).sendKeys(lastname);
	}

	public static void inputPass(WebDriver wd, String password) {
		wd.findElement(By.xpath(PASS)).sendKeys(password);

	}

	public static void inputAddress(WebDriver wd, String address) {
		wd.findElement(By.xpath(ADDRESS)).sendKeys(address);

	}

	public static void inputCity(WebDriver wd, String city) {
		wd.findElement(By.xpath(CITY)).sendKeys(city);

	}

	public static void inputPostalcode(WebDriver wd, String postalcode) {
		wd.findElement(By.xpath(POSTAL)).sendKeys(postalcode);

	}

	public static void country(WebDriver wd) {
		wd.findElement(By.xpath(COUNTRY)).click();
	}

	public static void inputMob(WebDriver wd, String mob) {
		wd.findElement(By.xpath(MOB)).sendKeys(mob);

	}

	public static void clickRegBtn(WebDriver wd) {
		wd.findElement(By.xpath(REGISTER)).click();
	}

}
