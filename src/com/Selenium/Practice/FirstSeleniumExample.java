package com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gopal\\eclipse-workspace\\core  java practice\\driver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com");
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-604\"]/a"));
		element.click();
		
		WebElement element1 = driver.findElement(By.xpath("//*[text()='QA Interview Questions']"));
 
		String str = element1.getText();
		
		if (str.equals("QA Interview Questions"))
		{
			System.out.println("System is in right direction");
		}
		else
		{
			System.out.println("System need to check ");
		}
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Selenium tutorial']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	
		element2.click();
		
		Thread.sleep(1500);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(1500);
		
		driver.quit();

	}

}
