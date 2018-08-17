package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_Checkboxes extends Initilization {

	@Test
	public void Checkboxes(){
		po.Checkboxes_click();
		String Str=driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2="Checkboxes";
		if (Str.equalsIgnoreCase(Str2)== true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");
		
	}
}
