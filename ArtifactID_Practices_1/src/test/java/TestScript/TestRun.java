package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MainScript.config;

public class TestRun extends config {

	@Test // ( priority =0, groups={"Working Tests"})
	public WebDriver AB_Testing_1() throws InterruptedException {
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
			logdata.tracelog("warning","In the exception loop");
		}
		driver.navigate().to("http://the-internet.herokuapp.com/");
		return driver;

	}
}
