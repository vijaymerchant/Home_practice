//  working properly

package TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import MainScript.config;

//@Test
public class Test_BasicAuth extends config{

	//public WebDriver driver;

//	Test_BasicAuth(WebDriver drv) throws InterruptedException {
//
//		
//
//		Test_ABTesting AB = new Test_ABTesting();
//
//		driver = AB.AB_Testing_1();
//		
//		drv = this.driver;
//
//	}

	@Test//( groups = { "Working Tests" }, alwaysRun=false, dependsOnMethods="Test_ABTesting.AB_Testing_1") // , dependsOnMethods =
														// "AB_Testing")
	public void Basic_Auth_1() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println("Executing Basic_Auth test");
		// driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		String heading = "Basic Auth";
		String data;

		try {
			if (driver.getPageSource().contains(heading)) {
				data = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();

				if (heading.equalsIgnoreCase(data))
					System.out.println("Page heading matched. Congrates for successful Login.....");
				else
					System.out.println("Page heading does not matched. You are not logged in.....");
			} else
				System.out.println("Mentioned name is not present on the page. Please check...");
			test.log(LogStatus.PASS, "PASS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				test.log(LogStatus.FAIL, test.addScreenCapture(capture(driver))+e.getMessage());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		

	}

}
