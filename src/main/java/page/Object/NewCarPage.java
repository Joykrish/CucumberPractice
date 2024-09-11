package page.Object;

import org.openqa.selenium.JavascriptExecutor;

import page.Base.BasePage;

public class NewCarPage extends BasePage {

	public void gotoKiya() {

	}

	public BMWPage gotoBMW() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(10000);
		click("BMW_Xpath");
		return new BMWPage();
	}

	public ToyotaPage gotoToyota() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		click("toyota_Xpath");
		return new ToyotaPage();
	}

}
