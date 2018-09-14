// Working properly.

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

		String image="/img/avatars/Original-Facebook-Geek-Profile-Avatar-2.jpg";
		String content= "Fugiat earum est et est odit corrupti unde ipsum m";
		
		if (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/img")).getAttribute("src").equals(image) != true || driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div")).getText().equals(content) != true){
	
				System.out.println("Content are dynamic on 3rd row");
			}else
				System.out.println("Contents are not changing on 3rd row after refresh");
	
		
	}
}
