package MainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class config {

	public pageObject po;
	public WebDriver driver = null;
	public Initilization init;

	public config() {

		init = new Initilization();
		// init.Initilization_1();
		driver = init.Initilization_1();

		// po=new pageObject(driver);
		po = PageFactory.initElements(driver, pageObject.class);
		driver.get("http://the-internet.herokuapp.com/");

	}

	@AfterSuite
	void AfterSuite() {
		// TODO Auto-generated method stub

	}

	@BeforeSuite
	void BeforeSuite() {

	
		// TODO Auto-generated method stub
		// driver = DriverFactory.getDriverInstance();
	}

}
