package TestScript;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.sikuli.api.Screen;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_BasicAuth extends Initilization {

	@Test
	public void Basic_Auth() throws InterruptedException {
		System.out.println("Executing Basic_Auth test");

		po.BasicAuth_click();
		System.out.println("After click");

		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		// Send some text to the alert
		promptAlert.sendKeys("Accepting the alert");
		Thread.sleep(4000); // This sleep is not necessary, just for
							// demonstration
		promptAlert.accept();

		/*
		 * try { Thread.sleep(2000); //
		 * Runtime.getRuntime().exec("C:\\Users\\win8\\Desktop\\Vijay //
		 * Mishra\\Vijay\\Automation\\AutoIT\\Signin.exe"); Screen scr = new
		 * Screen(); scr.Thread.sleep(2000); } catch (InterruptedException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * String heading = "Basic Auth"; String data =
		 * driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		 * if (heading.equalsIgnoreCase(data))
		 * System.out.println("Page heading matched. Congrates....."); }
		 */

	}

}
