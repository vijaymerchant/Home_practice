package MainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class config {
	
	public pageObject po;
	public WebDriver driver=null;
	public Initilization init;

	public config() {
		
		init = new Initilization();
		//init.Initilization_1();
		driver= init.Initilization_1();
		//po=new pageObject(driver);
		po=PageFactory.initElements(driver, pageObject.class);
	}
}
