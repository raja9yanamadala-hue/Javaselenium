package com.interview.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FramesAndWindows {
	
	
	
	/*home page

	Frame A -> Frame B -> Fram C -> dropdown-> select any value for the dropdown-

	Enable login hyperlink -> click link -> 5 new windows -> Which window contain login page( ) */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebElement homepage = driver.findElement(By.id("homepage")));
		
		homepage.click();

		driver.switchTo().frame("3 index");
		
		Select select = new Select();
		
		select.selectByValue("India");
		
		WebElement hyperlink = findelement(By.id("href"));
		
		hyperlink.click();
		
		Set<WebEelment> window = getWindowHandlers();
		
		While(window.size()>0)
		{	
			Iterator itr = window.getWindowHandle();
			
			Webelement element = login.getText();
			
			if (element.contains("Login Page")
					{
				
				System.out.println("Here is the login page plz enter details");			
						
					}	
			
		}
		
		window.defaultCOntext();
		
		

	}

}
