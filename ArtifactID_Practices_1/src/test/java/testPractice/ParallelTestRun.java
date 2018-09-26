package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestRun {
	

    @Test    
    public void executSessionOne(){
            //First session of WebDriver
        WebDriverManager.chromedriver().setup();
        
            WebDriver driver1 = new ChromeDriver();
        	DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "11.2");
			caps.setCapability("device", "iPad Pro");
			caps.setCapability("real_mobile", "true");
			//caps.setCapability("browserstack.selenium_version", "3.8.0");
			caps.setCapability("browserstack.debug", true);
            //Goto guru99 site
            driver1.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver1.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    //@Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
            //Goto guru99 site
        driver2.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver2.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
    //@Test    
        public void executSessionThree(){
            //Third session of WebDriver
       WebDriverManager.chromedriver().setup();
        WebDriver driver3 = new ChromeDriver();
            //Goto guru99 site
        driver3.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver3.findElement(By.name("uid")).sendKeys("Driver 3");
        
        }
}
