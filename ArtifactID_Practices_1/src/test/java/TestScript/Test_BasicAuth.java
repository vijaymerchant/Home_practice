//  working properly

package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;
//@Test
public class Test_BasicAuth extends Initilization {

	@Test (groups={"Working Tests"})
	public void Basic_Auth() throws InterruptedException {
		System.out.println("Executing Basic_Auth test");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
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
