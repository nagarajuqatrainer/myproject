package com.AppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.AppTest.Utilities.BrowserFactory;
import com.AppTest.Utilities.ConfigReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import appObjects.LoginObjects;



public class AppTest 
{
	
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriver driver;
	public static ConfigReader config;
	public static BrowserFactory browser;
	//public static LoginObjects loginpage;
   
	
	@Test
	public void verifyTest() {
		config=new ConfigReader();
		driver=BrowserFactory.getbrowser(ConfigReader.getbrowserdriver(), config.getbrowserurl());
		
	}
	
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
	
}
