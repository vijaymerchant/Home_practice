package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_Dropdown extends Initilization {

	@Test
	public void Dropdown() {
		po.Dropdown_click();
		System.out.println("Testing Dropdown");
		String Str = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2 = "Dropdown List";
		if (Str.equalsIgnoreCase(Str2) == true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");

		WebElement Drop = driver.findElement(By.id("dropdown"));
		Select s = new Select(Drop);
		s.selectByVisibleText("Option 1");
	}

}