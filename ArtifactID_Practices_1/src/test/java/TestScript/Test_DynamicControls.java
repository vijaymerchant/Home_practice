package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DynamicControls { // extends Initilization {
	WebDriver driver = null;
	static ExtentTest test;
	static ExtentReports report;
	// @Test
	// public void DynamicControls(){
	// po.DynamicControls_click();
	// WebElement addCheckbox =
	// driver.findElement(By.xpath("//input[@id='checkbox'"));
	// }

	/**
	 * Code to clear browser cache
	 * 
	 * @see /deep/ is added before ID to access #shadow elements
	 * 
	 */
	// @Test
	public void Practice_1() {
		// clear cache code for chrome -
		// https://intoli.com/blog/clear-the-firefox-browser-cache/
		// https://intoli.com/blog/clear-the-chrome-browser-cache/
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("chrome://settings/clearBrowserData");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
		System.out.println(driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")));
		// driver.findElement(By.cssSelector("::shadow
		// /paper-button/#clearBrowsingDataConfirm")).click();
		// System.out.println(driver.findElement(By.cssSelector("::shadow
		// /paper-button/#clearBrowsingDataConfirm")));

	}

	/**
	 * Screen shot code With Extent report adding screenshot in the report.
	 * 
	 */
	//@Test
	public void Practice_2() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo with scree shot code");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(src, new File("C:/selenium/error.png"));
			//test.log(LogStatus.PASS, "File Saved");
			test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "Test Pass1");
		} catch (Exception e) {
			System.out.println(e);
			test.log(LogStatus.FAIL, "Test Failed");
		}
		report.endTest(test);
		report.flush();
	}
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	
	//test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
	public static String capture(WebDriver driver) throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File Dest = new File("C:/selenium/" + System.currentTimeMillis()
	+ ".png");
	String errflpath = Dest.getAbsolutePath();
	FileUtils.copyFile(scrFile, Dest);
	return errflpath;
	}
	
	@Test
	public void Practice_3(){
		String [][] argCopy = new String[2][2];
        int x;
        //argCopy[0] = ;
        //x = argCopy[0].length;
        //for (int y = 0; y < x; y++) 
        {
       //     System.out.print(" " + argCopy[0][y]);
        }
	}

}
