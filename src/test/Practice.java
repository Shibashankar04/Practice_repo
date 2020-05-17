package test;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://lms2-staging.benchmarkuniverse.com/?realm=banyan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ba1_teach1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='user-profile-menu']/ul/a[2]")).click();
		
//		//		driver.quit();
	}
}