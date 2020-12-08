package com.myApp.objectrep;

import java.io.FileInputStream;
import java.util.Properties;

public class Objectrep {
	
	public Properties prop =null;
	public Properties getObjects() {
		
		try {
			FileInputStream fis = new FileInputStream("src\\test\\resources\\objects.properties");
			prop=new Properties();
			prop.load(fis);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	public String getChromePath() {
		 return prop.getProperty(getChromePath());
	}
	
	
	public String getBrowsername() {
		return prop.getProperty("Browser");
	}
	
	
	public String getSampleformLink() {
		return prop.getProperty("mycontactform_samplelink");
	}

}
