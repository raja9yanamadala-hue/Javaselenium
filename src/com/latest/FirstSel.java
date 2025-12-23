package com.latest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "c://driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://youtube.com");
		
		driver.findElement(By.id("uname"));
		
		driver.findElement(By.id("pas"));
		
		driver.findElement(By.className("subbmit")).click();
		
	}

}
