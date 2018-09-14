// Not working

package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MainScript.Initilization;

public class Test_ContextMenu_NotWorking extends Initilization {

	@Test
	public void ContextMenu() throws InterruptedException{
		po.ContextMenu_click();
		Actions oAction = new Actions(driver);
		oAction.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div/div")));
		Thread.sleep(2000);
		//oAction.contextClick(driver.findElement(By.xpath("html/body/div[2]/div/div/div"))).build().perform();  /* this will perform right click */
		oAction.contextClick().build().perform();
		Thread.sleep(2000);
		
		oAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		 oAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		 oAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		 oAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		 oAction.sendKeys(Keys.ENTER).build().perform();
		
//		WebElement elementOpen=null;
//		try {
//			elementOpen = driver.findElement(By.linkText("the-internet"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Not clicked on the menu item.");
//			e.printStackTrace();
//		}
//
//		//elementOpen.click();
//		Robot robot=null;
//		try {
//			robot = new Robot();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
