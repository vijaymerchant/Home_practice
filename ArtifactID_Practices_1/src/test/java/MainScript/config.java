package MainScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class config {

	public pageObject po;
	public WebDriver driver = null;
	public Initilization init;
	public Log logdata; 
	public Logger logger;

	public config() {

		init = new Initilization();
		// init.Initilization_1();
		driver = init.Initilization_1();

		logdata=new Log();
		
		po = PageFactory.initElements(driver, pageObject.class);
		//driver.get("http://the-internet.herokuapp.com/");

	}

	//@AfterSuite
	void AfterSuite() {
		// TODO Auto-generated method stub

	}

	//@BeforeSuite
	void BeforeSuite() {

	
		// TODO Auto-generated method stub
		// driver = DriverFactory.getDriverInstance();
	}

}
