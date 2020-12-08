package com.myAppConfiguration;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.myApp.objectrep.Objectrep;

public class BaseConfiguration extends Objectrep
{
	public Properties prop=null;
	public WebDriver driver=null;
	public FileInputStream fis;
	
	
	public void InvokeBrowser() {
		
		try {
			fis=new FileInputStream("src\\test\\resources\\config.properties");
			prop=new Properties();
			prop.load(fis);
			
			String br = prop.getProperty("Browser");
			if(br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.ie.driver", "./Drivers/IEdriver.exe");
				driver=new InternetExplorerDriver();
			}
			
			
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			//String imp_wait=prop.getProperty("ImplicitWait");
			//int implicit_wait=Integer.parseInt(imp_wait);
			//driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
    
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
