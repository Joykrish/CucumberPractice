package page.Object;

import Utils.SeleniumDriver;
import page.Base.BasePage;

public class HomePage extends BasePage {

	public void mouseOverNewCar() {
		mouseOver("NewCars_Xpath");
	}

	public NewCarPage clickFindNewCar() {
		click("FindNewCar_Xpath");
		return new NewCarPage();
	}

	public void searchCars() {

	}
}
