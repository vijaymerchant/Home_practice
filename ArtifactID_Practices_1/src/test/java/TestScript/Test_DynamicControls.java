package TestScript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import MainScript.Initilization;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DynamicControls { // extends Initilization {
	WebDriver driver = null;

	// @Test
	// public void DynamicControls(){
	// po.DynamicControls_click();
	// WebElement addCheckbox =
	// driver.findElement(By.xpath("//input[@id='checkbox'"));
	// }
	//@Test
	public void Practice_1() {
		// clear cache code for chrome - https://intoli.com/blog/clear-the-firefox-browser-cache/
		// https://intoli.com/blog/clear-the-chrome-browser-cache/
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("chrome://settings/clearBrowserData");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
		System.out.println(driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")));
		// driver.findElement(By.cssSelector("::shadow
		// /paper-button/#clearBrowsingDataConfirm")).click();
		// System.out.println(driver.findElement(By.cssSelector("::shadow
		// /paper-button/#clearBrowsingDataConfirm")));

	}
	
	@Test
	public void Practice_2() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("Google.com");
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		try {
		FileUtils. copyFile(src, new File("C:/selenium/error.png"));
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
