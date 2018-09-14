// Test script is running properly.

package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;
import MainScript.config;

public class Test_ABTesting extends config//extends Initilization 
{

	@Test (groups={"Working Tests"})
	public void AB_Testing () throws InterruptedException {
	
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
		}
		
	}



}
