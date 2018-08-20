package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_DragandDrop extends Initilization {

	@Test
	public void DragandDrop() throws InterruptedException {
		po.DragandDrop_click();
		System.out.println("Testing Checkbox");
		String Str = driver.findElement(By.xpath(".//*[@id='content']/div/h3")).getText();
		String Str2 = "Drag and Drop";
		if (Str.equalsIgnoreCase(Str2) == true)
			System.out.println("We are on right page");
		else
			System.out.println("Opps wrong page");

		System.out.println("Before Drag and Drop");
		Thread.sleep(2000);
		String a = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]"))
				.getText();
		System.out.println(a);
		if (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]")).equals(a)
				)
			System.out.println("A is in First place");

		else
			System.out.println("B is in First place");
		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).build().perform();

		System.out.println("After Drag and Drop");
		if (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]"))
				.getText() == a)

			System.out.println("Drag and Drop is unsuccessful");
		else
			System.out.println("Drag and Drop is successful");
	}
}
