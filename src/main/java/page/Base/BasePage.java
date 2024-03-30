package page.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.SeleniumDriver;

public class BasePage {

	public static WebDriver driver;
	private WebElement mouseOverElement;

	public static CarBase carbase;

	public BasePage() {
		driver = SeleniumDriver.getDriver();
		carbase = new CarBase();
	}

	public void mouseOver(String locator) {

		if (locator.endsWith("_Xpath")) {
			mouseOverElement = driver.findElement(By.xpath(SeleniumDriver.or.getProperty(locator)));
		}
		if (locator.endsWith("_ID")) {
			mouseOverElement = driver.findElement(By.id(SeleniumDriver.or.getProperty(locator)));
		}
		new Actions(driver).moveToElement(mouseOverElement).perform();

	}

	public void click(String locator) {

		if (locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(SeleniumDriver.or.getProperty(locator))).click();
		}
		if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.or.getProperty(locator))).click();
			;
		}

	}

	public boolean isElementPresent(String locator) {
		try {
			if (locator.endsWith("_Xpath")) {
				driver.findElement(By.xpath(SeleniumDriver.or.getProperty("")));
			}
			if (locator.endsWith("_ID")) {
				driver.findElement(By.id(SeleniumDriver.or.getProperty("")));
			}
			return true;
		} catch (Throwable t) {
			// TODO: handle exception
			return false;
		}

	}

	public void type(String locator, String value) {

		if (locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(SeleniumDriver.or.getProperty(""))).sendKeys(value);
		}
		if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.or.getProperty(""))).sendKeys(value);
		}

	}

	public static String getText(String locator) {
		String text = null;
		if (locator.endsWith("_Xpath")) {
			text = driver.findElement(By.xpath(SeleniumDriver.or.getProperty(locator))).getText();
		}
		if (locator.endsWith("_ID")) {
			text = driver.findElement(By.id(SeleniumDriver.or.getProperty(locator))).getText();
		}
		return text;

	}

}
