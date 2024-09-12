package page.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.SeleniumDriver;
import page.Base.BasePage;

public class NewCarPage extends BasePage {

	public void gotoKiya() {

	}

	public BMWPage gotoBMW() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)", "");
		
		Thread.sleep(30000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SeleniumDriver.or.getProperty("BMW_Xpath"))));
		we.click();
		return new BMWPage();
	}

	public ToyotaPage gotoToyota() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)", "");
		click("toyota_Xpath");
		return new ToyotaPage();
	}

}
