package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_1{
	static WebDriver driver = null;

	@Test
	public void f() throws InterruptedException {
		Test_ABTesting a=new Test_ABTesting();
		a.Verify(driver);
		
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\win8\\Desktop\\Vijay Mishra\\Vijay\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
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
