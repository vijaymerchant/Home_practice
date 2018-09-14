// Test script is running properly.

package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_Checkboxes extends Initilization {

	@Test
	public void Checkboxes(){
		po.Checkboxes_click();
		System.out.println("Testing Checkbox");
		String Str=driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2="Checkboxes";
		if (Str.equalsIgnoreCase(Str2)== true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");
		
		if (driver.findElement(By.xpath("html/body/div[2]/div/div/form/input[1]")).isSelected()==true)
			System.out.println("Checkbox 1 is selected");
		else
			System.out.println("Checkbox 1 is not selected");

		if (driver.findElement(By.xpath("html/body/div[2]/div/div/form/input[2]")).isSelected()==true)
			System.out.println("Checkbox 2 is selected");
		else
			System.out.println("Checkbox 2 is not selected");
	}
}
