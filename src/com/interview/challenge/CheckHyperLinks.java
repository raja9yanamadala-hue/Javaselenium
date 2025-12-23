package com.interview.challenge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHyperLinks {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gopal\\Downloads\\chromedriver-win32.zip\\chromedriver-win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/");
		
		List<WebElement> element =  driver.findElements(By.tagName("a"));
		for(int i=0;i<element.size();i++)
		{
			
			WebElement el = element.get(i);
			String url = el.getAttribute("href");
			verify (url);
		}
		
		driver.quit();

	}
	
	public static void verify(String link) throws IOException
	{
		URL link1 = new URL(link);
		HttpURLConnection con = (HttpURLConnection)link1.openConnection();
		con.connect();
		if(con.getResponseCode()== 200)
		{
			System.out.println(link + " - " + con.getResponseMessage());
			
		} else {
			
			System.out.println(link + " - " + con.getResponseMessage() + " - " + "is a broken link");
		}	
	}

}
