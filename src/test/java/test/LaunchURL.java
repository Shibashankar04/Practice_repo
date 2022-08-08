package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import base.Log4jdemo;
import base.TestBase;

public class LaunchURL extends TestBase {

	
	@Test
	public void openChrome() {
		
		
//		Log4jdemo.startTestCase("openChrome");
		driver.get("https://www.google.com");
		
		Log4jdemo.info("Google home page launched");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		Log4jdemo.endTestCase("openChrome");
	}
	
	
}
