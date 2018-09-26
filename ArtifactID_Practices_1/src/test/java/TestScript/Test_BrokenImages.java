// Test script is running properly.

package TestScript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MainScript.config;

public class Test_BrokenImages extends config {
	
	@Test(alwaysRun=false)
	public void Broken_Images(){
		po.BrokenImages_click();
		List<WebElement> links = driver.findElements(By.tagName("img"));
        int brokenImagesCount=0;
        for (int i = 0; i < links.size(); i++) {
            //System.out.println(links.get(i));
            String linkURL=links.get(i).getAttribute("src");
            //System.out.println(links.get(i).getText());
            URL url=null;
			try { 
				url = new URL(linkURL);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            HttpURLConnection http=null;
			try {
				http = (HttpURLConnection) url.openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// https://stackoverflow.com/questions/43389340/how-to-find-broken-images-for-an-entire-web-site-in-selenium-webdriver-using-jav
            http.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            http.setConnectTimeout(10000);
            http.setReadTimeout(20000);
            int statusCode=0;
			try {
				statusCode = http.getResponseCode();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if(statusCode==404||statusCode==500){
                brokenImagesCount=brokenImagesCount+1;
                System.out.println(linkURL+" and its Status codes is: "+statusCode);
            }
        }
        System.out.println("total number of broken images are: "+brokenImagesCount);
	}

}
