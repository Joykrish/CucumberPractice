package StepDefinations;

import io.cucumber.java.en.*;

public class Login {
	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		System.out.println("@Given user navigates to the facebook website");
	}

	@When("user validates the homepage tittle")
	public void user_validates_the_homepage_tittle() {
		System.out.println("@When user validates the homepage tittle");
	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
		System.out.println("@Then user enters " +username+ " username");
	}

	@And("user enters {string} password")
	public void user_enters_password(String password) {
		System.out.println("@And user enters" +password+ " Password");
	}

	@And("user clicks on the sign-in buttons")
	public void user_clicks_on_the_sign_in_buttonss() {
		System.out.println("@user clicks on the sign-in buttons");
	}
}
