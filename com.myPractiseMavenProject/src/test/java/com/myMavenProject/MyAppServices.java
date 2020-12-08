package com.myMavenProject;





import com.myApp.objectrep.Objectrep;
import com.myApp.utility.CommonUtils;
import com.myAppConfiguration.BaseConfiguration;



public class MyAppServices extends BaseConfiguration
{
	public Objectrep objectrep=null;
	
	
	//Launching browser
	public MyAppServices openMyContactFormHomePage() {
		objectrep=new Objectrep();
		InvokeBrowser();
		return this;
		
	}
	
	public MyAppServices clickSampleFormLink() {
		CommonUtils.clickButton("xpath", objectrep.getObjects().getProperty("mycontactform_samplelink"), driver);
		return this;
		
		
	}
	
	public MyAppServices innerTextObject() {
		
		CommonUtils.insertText("name",objectrep.getObjects().getProperty("subject_field") ,"qatrainer", driver);
		return this;
		
	}
	
	public MyAppServices innerTextObject1() {
		CommonUtils.insertText("name",objectrep.getObjects().getProperty("password_field") ,"admin123", driver);
		return this;
	}
	
   
	public MyAppServices clickLoginButton() {
		CommonUtils.clickButton("name", objectrep.getObjects().getProperty("login_button"), driver);
		return this;
	}
	
	public MyAppServices clickLogout() {
		CommonUtils.clickweblink("xpath", objectrep.getObjects().getProperty("logout"), driver);
		return this;
	}
	
	
	
	public void closeBrowser() {
		
		driver.close();
	}
	
	
	
	/*
	public MyAppServices clickHowCan() {
		CommonUtils.clickButton("xpath", objectrep.getObjects().getProperty("how_can"), driver);
		return this;
	}
	
	
	public MyAppServices clickFeatureWeblink() {
		CommonUtils.clickweblink("xpath", objectrep.getObjects().getProperty("featurelink"), driver);
		return this;
	}
	*/
	
}
