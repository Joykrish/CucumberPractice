package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;

public class LoginProduction {
	@And("user  validates the captcha")
	public void user_validates_the_captcha() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User Validates the Captcha");
	}
	
	@And("user enters firstName and LastName")
	public void user_enters_first_name_and_last_name(io.cucumber.datatable.DataTable dataTable) {
		/*List<List<String>> data =dataTable.asLists();
		System.out.println("FirstName is: "+data.get(0).get(0)+"Last Name is: "+data.get(0).get(1));
		System.out.println("FirstName is: "+data.get(1).get(0)+"Last Name is: "+data.get(1).get(1));*/

		
		/*List<Map<String, String>>map=dataTable.asMaps();
		System.out.println(map.get(0).get("FistName")+" LastName is "+map.get(0).get("LastName"));
		System.out.println(map.get(1).get("FistName")+" LastName is "+map.get(1).get("LastName"));*/
		
		for(Map<String,String>data:dataTable.asMaps(String.class,String.class)) {
			System.out.println("Fist Name is "+data.get("FistName") +"Last Name is "+data.get("LastName"));
		}
	}

}
