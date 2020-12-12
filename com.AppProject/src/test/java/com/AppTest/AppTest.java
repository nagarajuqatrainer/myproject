package com.AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.AppTest.Utilities.AppObjects;
import com.AppTest.Utilities.BrowserFactory;
import com.AppTest.Utilities.ConfigReader;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class AppTest 
{
	

	public static WebDriver driver;
	public static ConfigReader config;
	public static BrowserFactory browser;
	public static AppObjects loginpage;
	
   
	
	@Test(alwaysRun=true)
	public void verifyTest() {
		config=new ConfigReader();
		
		
		driver=BrowserFactory.getbrowser(ConfigReader.getbrowserdriver(), config.getbrowserurl());
		
		loginpage = new AppObjects(driver);
		loginpage.verifyusername("tester");
		loginpage.verifypassword("admin");
		loginpage.clickloginbutton();
		
	}
	
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
	
}
