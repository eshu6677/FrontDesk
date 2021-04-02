package ReUseable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	
public static WebDriver  driver;
	
	@BeforeTest
	public void openBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\em21154\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://frontdesk.corp.ojas-it.com/");
		
		
		
	}
	@AfterTest
	public void closebrowser(){
		
		
		driver.close();
		
	}

}
