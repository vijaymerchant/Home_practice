package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_DisappearingElements extends Initilization {

	@Test
	public void DisappearingElements() {
		po.DisappearingElements_click();
		// /html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]
		System.out.println("Testing Disappearing Elements");
		String Str = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2 = "Disappearing Elements";
		if (Str.equalsIgnoreCase(Str2) == true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");

		// /html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]
		System.out.println(driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li")).size());

		if (driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li")).size() == 5) {
			System.out.println("All menu items are present on page load");
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")).click();
			driver.navigate().back();
			if (driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li")).size() == 5) {
				System.out.println("All menu items are present after click");
			} else
				System.out.println("Some menu is missing after comming back");

		} else
			System.out.println("Something items are missing from menu on page load");

	}

}
