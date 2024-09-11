 package StepDefinations;

import org.testng.Assert;

import Utils.SeleniumDriver;
import io.cucumber.java.en.*;
import page.Base.BasePage;
import page.Object.AmericanExperssLogin;
import page.Object.HomePage;
import page.Object.NewCarPage;
import page.Object.ToyotaPage;

public class AmericalExpress {
	HomePage hp=new HomePage();
	AmericanExperssLogin aml=new AmericanExperssLogin();
	@Given("I navigate to American express")
	public void i_navigate_to_american_express() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testSiteUrl2"));
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		hp.click("btnLoginAmericanExpress_Xpath");
	   
	}
	
	@When("user enters userId {string}")
	public void user_enters_user_id(String userID) throws InterruptedException {
		aml.enterUseID(userID);
	   
	   
	}
	@Then("validate user in the login Page")
	public void validate_user_in_the_login_page() {
	   
	}


}
