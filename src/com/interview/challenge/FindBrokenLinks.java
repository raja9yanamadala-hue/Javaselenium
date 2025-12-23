package com.interview.challenge;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gopal\\Downloads\\chromedriver-win32.zip\\chromedriver-win32\\chromedriver.exe");
		
/*		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<list.size();i++)
		{
			
			WebElement element = list.get(i);
			
			String url = element.getAttribute("href");
			
			verifyLink(url);
		}
		
		driver.quit();
	}
	
	public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
		
		} */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new window by clicking the button
         driver.findElement(By.id("windowButton")).click();

         // Click on the new window element and read the text displayed on the window
         WebElement text = driver.findElement(By.id("sampleHeading"));
   
         // Fetching the text using method and printing it     
         System.out.println("Element found using text: " + text.getText());
         driver.quit();
    }

}
