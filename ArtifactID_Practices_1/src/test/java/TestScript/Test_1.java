package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MainScript.pageObject;

public class Test_1 {

	public pageObject po;
	WebDriver driver;

	public Test_1() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\win8\\Desktop\\Vijay Mishra\\Vijay\\Automation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("http://the-internet.herokuapp.com/");

		try {

			po=PageFactory.initElements(driver, pageObject.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In initilization");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
