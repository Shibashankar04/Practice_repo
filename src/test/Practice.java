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
		driver.get("https://lms2-staging.benchmarkuniverse.com/?realm=rainbow");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo_teach1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
		//Assignments link
		driver.findElement(By.xpath("//img[@alt='My Library']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='selectBox-arrow']")).click();

		List<WebElement> dd_menus=driver.findElements(By.xpath("//ul[1]/li/a"));
		int no=dd_menus.size();
		System.out.println(no);
		
		for(int i=0;i<=dd_menus.size();i++)
		{
			WebElement required_string=dd_menus.get(i);
			System.out.println(required_string.getText());
			
			if(required_string.getText().equals("Benchmark Writer's Universe")) {
				required_string.click();
				break;
				
			}
			
		}
		
		driver.findElement(By.xpath("//div[@class='components-container']/div[1]")).click();
		
		String mainwindow=driver.getWindowHandle();
		Set<String> handels=driver.getWindowHandles();
		for (String handle1 : handels) 
		{

			//System.out.println(handle1);

			driver.switchTo().window(handle1);
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='js-exit-text']")).click();
		
		
		driver.switchTo().window(mainwindow);


		//		//		driver.quit();
	}
}