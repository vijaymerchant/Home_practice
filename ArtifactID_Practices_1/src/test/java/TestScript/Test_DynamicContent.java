package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_DynamicContent extends Initilization {

	@Test
	public void DynamicContent(){
		po.DynamicContent_click();
		System.out.println("Testing Dynamic Content");
		String Str = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2 = "Dynamic Content";
		if (Str.equalsIgnoreCase(Str2) == true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");

	}
}
