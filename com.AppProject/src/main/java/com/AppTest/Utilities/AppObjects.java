package com.AppTest.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppObjects {
	
	
	
		
		public static WebDriver driver;
		//public static ConfigReader config1;
		
		
		//@FindBy(name="user")WebElement uname;
		//@FindBy(name="pass")WebElement pword;
		//@FindBy(name="btnSubmit")WebElement loginbutton;
	
		
		
		
		public AppObjects(WebDriver driver) {
			AppObjects.driver=driver;
		}
		
		
		public void verifyusername(String un) {
			driver.findElement(By.name("user")).sendKeys(un);
		}
		
		public void verifypassword(String pw) {
			driver.findElement(By.name("pass")).sendKeys(pw);
		}
		
		
		
		
		public void clickloginbutton() {
			WebElement button = driver.findElement(By.name("btnSubmit"));
			if(button.isEnabled()) {
				button.click();
				System.out.println("Action performed");
				
			}
			else
			{
				System.out.println("Does not performed");
			}
			
			
		}
	

	}

