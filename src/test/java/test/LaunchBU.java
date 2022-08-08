package test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import base.Log4jdemo;
import base.TestBase;


public class LaunchBU extends TestBase {

	@Test
	public void buHomepage() {

//		Log4jdemo.startTestCase();
		
		driver.get("https://lms2-staging.benchmarkuniverse.com/?realm=ardataorrdata");

		Log4jdemo.info("BU stging URL entered");



		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		Log4jdemo.endTestCase("buHomepage");

	}
}
