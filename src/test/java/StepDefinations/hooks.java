package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

/*public class hooks {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Create DB connection");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("Close DB connection");
	}
	@Before(order=0)
	public void  Setup() {
		System.out.println("Hooks to Launch the browser");
	}
	@After(order=1)
	public void  tearDown() {
		System.out.println("Hooks to Close the browser");
	}
	@Before(order=1)
	public void  Setup1() {
		System.out.println("Hooks to Launch the browser1");
	}
	@After(order=2)
	public void  tearDown1() {
		System.out.println("Hooks to Close the browser1");
	}
	@BeforeSteps
	public void beforeStep() {
		System.out.println("Before Step Adding the log");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("After Step Removing the  log");
	}
}
*/

public class  hooks{
	public WebDriver driver;
	@Before
	public void  setUP() throws IOException {
		SeleniumDriver.SetUpDriver();
	}
	@After
public void  TearDown(Scenario scenario) throws InterruptedException {
	if(scenario.isFailed()) {
		Thread.sleep(500);
		driver=SeleniumDriver.getDriver();
		byte[]  sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sc,"image/png", "Screenshot");
	}
		SeleniumDriver.tearDown();
	
	}
}

