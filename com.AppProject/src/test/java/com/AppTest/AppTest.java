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
		
		AppObjects loginpage = new AppObjects(driver);
		loginpage.clickloginbutton();
		System.out.println("click login button");
		loginpage.verifyusername("tester");
		System.out.println("verify user name");
		
		
	}
	
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
	
}
