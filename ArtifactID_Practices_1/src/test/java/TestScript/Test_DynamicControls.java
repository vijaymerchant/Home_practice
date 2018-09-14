package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_DynamicControls extends Initilization {

	@Test
	public void DynamicControls(){
		po.DynamicControls_click();
		WebElement addCheckbox = driver.findElement(By.xpath("//input[@id='checkbox'"));
}
}
