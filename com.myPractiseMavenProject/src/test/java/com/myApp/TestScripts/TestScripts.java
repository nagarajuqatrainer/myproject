package com.myApp.TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myAppConfiguration.BaseConfiguration;
import com.myMavenProject.MyAppServices;

import captureScreens.CaptureScreenshot;

public class TestScripts {
	
	public static WebDriver driver=null;
	public MyAppServices appservice;
	public BaseConfiguration browser;
	public CaptureScreenshot capture;
	
	@BeforeClass
	public void init() {
		appservice= new MyAppServices();
		browser=new BaseConfiguration();
		capture=new CaptureScreenshot();
	}
	
	@Test
	public void createSampleFormCustomer() {
		
		appservice.openMyContactFormHomePage().clickSampleFormLink().innerTextObject().innerTextObject1().clickLoginButton().clickLogout().closeBrowser();
		
		CaptureScreenshot.captureScreenshot(driver, "verify login test");
		
		
		
		
		
		
	}
	
	
	
	    
	

}
