package appSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class AppBaseSuite {
	
	
	public static WebDriver driver;
	
	
@BeforeSuite(alwaysRun=true)
public void setupsuite() {
	
	System.out.println("Run Before suite");
	
	
}

}
