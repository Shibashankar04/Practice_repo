package base;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	@Parameters("webdriver")
	public void openBrowser(@Optional("chrome") String webdriver) throws MalformedURLException {

		switch(webdriver) {
		case "chrome":
//			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=WebDriverManager.chromedriver().create();
//			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}


	}

	@AfterSuite
	public static void tearDown() {
		driver.quit();
	}
	
	@BeforeTest
	
public static void getLog() {
		
//		log=Logger.getLogger(Log4jdemo.class.getName());
		PropertyConfigurator.configure("log4j2.properties");
		
		
	}

	@BeforeMethod
	public static void startTestCase(Method md) {
		Log4jdemo.info("=============  "+md.getName().toString()+"  test started ============");

	}

	@AfterMethod
	public static void endTestCase(Method md) {
		Log4jdemo.info("=============  "+md.getName().toString()+"  test ended ============");

	}
	
}
