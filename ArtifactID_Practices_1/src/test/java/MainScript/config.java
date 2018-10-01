package MainScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class config {

	public static pageObject po;
	public static WebDriver driver;
	public static Initilization init;
	public static Log logdata;
	public static Logger logger;
	public static ExtentTest test;
	public static ExtentReports report;

	// public config() {

	// init = new Initilization();
	// // init.Initilization_1();
	// driver = init.Initilization_1();
	//
	// logdata=new Log();
	//
	// po = PageFactory.initElements(driver, pageObject.class);
	// //driver.get("http://the-internet.herokuapp.com/");

	// }

	@AfterSuite
	public void AfterSuite() {
		// TODO Auto-generated method stub
		report.endTest(test);
		report.flush();
		driver.close();
	}

	@BeforeSuite
	public void BeforeSuite() {

		init = new Initilization();
		// init.Initilization_1();
		driver = init.Initilization_1();

		logdata = new Log();

		po = PageFactory.initElements(driver, pageObject.class);
		// driver.get("http://the-internet.herokuapp.com/");
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentReport Demo ....");

		// TODO Auto-generated method stub
		// driver = DriverFactory.getDriverInstance();
	}

	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:/selenium/" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}

}
