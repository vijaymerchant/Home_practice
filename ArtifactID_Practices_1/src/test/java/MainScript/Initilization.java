package MainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initilization {

	public pageObject po;
	public WebDriver driver;

	public WebDriver Initilization_1() {

		try {
			// System.setProperty("webdriver.chrome.driver","C:\\Users\\win8\\Desktop\\Vijay
			// Mishra\\Vijay\\Automation\\Drivers\\chromedriver.exe");
			// driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\win8\\Desktop\\Vijay Mishra\\Vijay\\Automation\\Drivers\\geckodriver.exe");
			//driver = new FirefoxDriver();
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "11.2");
			caps.setCapability("device", "iPad Pro");
			caps.setCapability("real_mobile", "true");
			caps.setCapability("browserstack.selenium_version", "3.8.0");
			caps.setCapability("browserstack.debug", true);

			
		} catch (Exception e) {

			e.printStackTrace();
		}

	
		return driver;

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		Thread.sleep(2000);
	}
//
//	@AfterMethod
//	public void afterMethod() {
//		// driver.close();
//	}
//
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Before Class");
//	}
//
//	@AfterClass
//	public void afterClass() {
//		System.out.println("After Class");
//		//driver.get("http://the-internet.herokuapp.com/");
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Before Test");
//	}
//
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Test");
//	}

}
