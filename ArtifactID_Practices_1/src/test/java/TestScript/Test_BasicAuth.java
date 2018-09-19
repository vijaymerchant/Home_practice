//  working properly

package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MainScript.Initilization;
import MainScript.config;

//@Test
public class Test_BasicAuth { // extends Test_ABTesting{

	public WebDriver driver;

	Test_BasicAuth(WebDriver drv) throws InterruptedException {

		

		Test_ABTesting AB = new Test_ABTesting();

		driver = AB.AB_Testing_1();
		
		drv = this.driver;

	}

	@Test(priority = 2, groups = { "Working Tests" }) // , dependsOnMethods =
														// "AB_Testing")
	public void Basic_Auth_1() throws InterruptedException {
		System.out.println("Executing Basic_Auth test");
		// driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		String heading = "Basic Auth";
		String data;

		if (driver.getPageSource().contains(heading)) {
			data = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();

			if (heading.equalsIgnoreCase(data))
				System.out.println("Page heading matched. Congrates for successful Login.....");
			else
				System.out.println("Page heading does not matched. You are not logged in.....");
		} else
			System.out.println("Mentioned name is not present on the page. Please check...");

	}

}
