package page.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.SeleniumDriver;
import page.Base.BasePage;

public class HomePage extends BasePage {
	
	

	public void mouseOverNewCar() {
		mouseOver("NewCars_Xpath");
	}

	public NewCarPage clickFindNewCar() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SeleniumDriver.or.getProperty("FindNewCar_Xpath"))));
		we.click();
		
		return new NewCarPage();
	}

	public void searchCars() {

	}
}
