package com.myApp.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myAppConfiguration.BaseConfiguration;

public class CommonUtils extends BaseConfiguration {
	
	
	
public static void clickweblink(String IdentifiedBy,String locator,WebDriver driver) {
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		}
		
}
	
	
	public static void clickButton(String IdentifiedBy,String locator,WebDriver driver) {
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).click();
			}
		
	}
	
	
	public static void clickRadioButton(String IdentifiedBy,String locator,WebDriver driver ) {
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).click();
			}
	}
	
	public static void insertText(String IdentifiedBy,String locator,String uname, WebDriver driver ) {
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(uname);
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).sendKeys(uname);
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(uname);
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).sendKeys(uname);
			}
	}
	
	public static void clickCheckBox(String IdentifiedBy,String locator,String uname, WebDriver driver ) {
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			WebElement chkbox =driver.findElement(By.id(locator));
			if(chkbox.isEnabled()) {
				chkbox.click();
			}
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).sendKeys(uname);
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(uname);
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("cssSelector")) {
				driver.findElement(By.cssSelector(locator)).sendKeys(uname);
			}
	}
	

}
