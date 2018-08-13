package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import MainScript.pageObject;

public class Test_ABTesting extends pageObject{
	
	WebDriver LocalDriver= null;
	
	public void Verify(WebDriver driver) throws InterruptedException{
		LocalDriver=driver;
		pageObject PO=new pageObject();
		Thread.sleep(2000);
		PO.AB_Testing_click(LocalDriver);
		Thread.sleep(2000);
		String heading="A/B Test Variation 1";
		String data= LocalDriver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		if (heading==data)
			System.out.println("Page heading matched. Congrates.....");
		else
			System.out.println("Page heading does not matched");
	}

}
