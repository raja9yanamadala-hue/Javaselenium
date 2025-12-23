package com.interview.challenge;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class WindowHandleExample1 {
	    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gopal\\Downloads\\chromedriver-win32.zip\\chromedriver-win32\\chromedriver.exe");
	    	
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