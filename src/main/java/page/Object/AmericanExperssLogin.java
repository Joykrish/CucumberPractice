package page.Object;

import Utils.SeleniumDriver;
import page.Base.BasePage;

public class AmericanExperssLogin extends BasePage {
	
	public void enterUseID(String userID) throws InterruptedException {
		
		type("textBoxLogin_Xpath",userID);
		Thread.sleep(10000);
	}

}
