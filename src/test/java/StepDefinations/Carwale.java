 package StepDefinations;

import org.testng.Assert;

import Utils.SeleniumDriver;
import io.cucumber.java.en.*;
import page.Base.BasePage;
import page.Object.HomePage;
import page.Object.NewCarPage;
import page.Object.ToyotaPage;

public class Carwale {
	
	HomePage hp=new HomePage();
	NewCarPage nc;
	ToyotaPage t;

	@Given("I navigate to Carwale website")
	public void i_navigate_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testSiteUrl"));
		
	}

	@When("user mousehover to newCars")
	public void user_mousehover_to_new_cars() throws InterruptedException {
		hp.mouseOverNewCar();
		
		
	}

	@Then("user clicks on the findnew Cars")
	public void user_clicks_on_the_findnew_cars() throws InterruptedException {
	
		 nc=hp.clickFindNewCar();
		
		Thread.sleep(5000);
	}

	@And("user clicks on {string} car")
	public void user_clicks_on_car(String carBrand) throws InterruptedException {
		Thread.sleep(5000);
		
		if(carBrand.equals("Toyota")) {
		t=nc.gotoToyota();
		}
		else if(carBrand.equals("BMW")){
			nc.gotoBMW();
		}
		
	}

	@And("user validates  the car title as {string}")
	public void user_validates_the_car_title(String carTitle) {
		System.out.println("Car Title is"+BasePage.carbase.getCarTitle());
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(BasePage.carbase.getCarTitle().equals(carTitle));
	}

}
