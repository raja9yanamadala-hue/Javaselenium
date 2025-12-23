package com.latest;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokeUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.driver", "c://driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://youtube.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
{
	
	WebElement ele = links.get(i);
	
	String url = ele.getAttribute("href");
	
	verify(url);
	
}
		

	}
	
	
	public static void  verify(String url)

	{
		
		URL url = new URL(url);
		
		HttpsURLConnection con =  (HttpsURLConnection)url.openCOnnection();
		
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println()
		}
		else
		{
			
		}
		
	}
}
