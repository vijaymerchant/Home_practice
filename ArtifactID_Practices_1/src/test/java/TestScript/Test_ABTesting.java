// Test script is running properly.

package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.config;

public class Test_ABTesting extends config {

	@Test // ( priority =0, groups={"Working Tests"})
	public void AB_Testing_1() // throws InterruptedException
	{
		
		driver.get("http://the-internet.herokuapp.com/");
		//logdata.tracelog("info","In the exception loop");
		System.out.println("Executing A/B Testing");
		po.AB_Testing_click();
		String heading = "A/B Test Variation 1";
		String data;
		try {
			data = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
			if (heading.equalsIgnoreCase(data))
				System.out.println("Page heading matched. Congrates.....");
			else
				System.out.println("Page heading does not matched");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logdata.tracelog("error","Error In the exception loop");
		}
		driver.navigate().to("http://the-internet.herokuapp.com/");
	//	return driver;

	}

}
