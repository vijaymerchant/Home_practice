package MainScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

public class config {

	public static pageObject po;
	public static WebDriver driver;
	public static Initilization init;
	public static Log logdata; 
	public static Logger logger;

	//public config() {

//		init = new Initilization();
//		// init.Initilization_1();
//		driver = init.Initilization_1();
//
//		logdata=new Log();
//		
//		po = PageFactory.initElements(driver, pageObject.class);
//		//driver.get("http://the-internet.herokuapp.com/");

	//}

	//@AfterSuite
	void AfterSuite() {
		// TODO Auto-generated method stub

	}

	@BeforeSuite
	public void BeforeSuite() {

		init = new Initilization();
		// init.Initilization_1();
		driver = init.Initilization_1();

		logdata=new Log();
		
		po = PageFactory.initElements(driver, pageObject.class);
		//driver.get("http://the-internet.herokuapp.com/");

		// TODO Auto-generated method stub
		// driver = DriverFactory.getDriverInstance();
	}

}
