package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;

	public static Properties config = new Properties();
	public static Properties or = new Properties();
	private FileInputStream fis;

	private SeleniumDriver() throws IOException {
		fis = new FileInputStream("./src/test/java/Resources/OR.properties");
		or.load(fis);

		fis = new FileInputStream("./src/test/java/Resources/Config.properties");
		config.load(fis);

		if (config.getProperty("browser").equals("chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			String homeDirectory = System.getProperty("user.dir");
			String driverPath = homeDirectory + "\\chromedriver.exe";
			System.out.println("Home  Directory is  " + homeDirectory);
			System.setProperty("webdriver.chrome.driver", driverPath);
//			System.setProperty("webdriver.chrome.driver",
//					"D:\\jaykishor data\\eclipse-workspace\\CucumberPractice\\chromedriver.exe");
			driver = new ChromeDriver(ops);
//			options.addArguments("--disable-notifications");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver(options);
		} else if (config.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, Integer.parseInt(config.getProperty("explicit.wait")));
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("explicit.wait")),
				TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void SetUpDriver() throws IOException {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
