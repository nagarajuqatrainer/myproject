package com.AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.AppTest.Utilities.BrowserFactory;
import com.AppTest.Utilities.ConfigReader;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class AppTest 
{
	
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver;
	public static ConfigReader config;
	public static BrowserFactory browser;
	//public static LoginObjects loginpage;
   
	
	@Test(alwaysRun=true)
	public void verifyTest() {
		config=new ConfigReader();
		
		driver=BrowserFactory.getbrowser(ConfigReader.getbrowserdriver(), config.getbrowserurl());
		driver.findElement(By.name("user")).sendKeys("tester");
		driver.findElement(By.name("btnSubmit")).click();
		
	}
	
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
	
}
