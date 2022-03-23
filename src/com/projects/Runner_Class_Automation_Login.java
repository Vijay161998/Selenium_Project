package com.projects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class_Automation_Login {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign.click();

		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ruvijay1998@gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Sachine@0130");

		WebElement sum = driver.findElement(By.id("SubmitLogin"));
		sum.click();
		
		WebElement dress = driver.findElement(By.xpath("//a[@ title ='Women']"));
		dress.click();
		
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	
		WebElement size = driver.findElement(By.id("layered_id_attribute_group_1"));
			size.click();
		
			WebElement color = driver.findElement(By.id("layered_id_attribute_group_8"));
			color.click();
		
			
		Actions find = new Actions(driver);
			WebElement add = driver.findElement(By.xpath("//img[@alt='Blouse']"));
			find.moveToElement(add).build().perform();
			
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
	
	try {
			
		WebElement card = driver.findElement(By.xpath("//a[@data-id-product='2']//ancestor::span[text()='Add to cart']"));
		card.click();
	} catch (Exception e) {

	e.printStackTrace();
			}
				
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		                                                                                                  
		WebElement Check = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		Check.click();

		////a[@data-id-product='2']cgvprocessCarrier
		
		WebElement summ = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		summ.click();

		WebElement addr = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		addr.click();

		WebElement che = driver.findElement(By.id("cgv"));
		che.click();
		
		WebElement shipp = driver.findElement(By.name("processCarrier"));
		shipp.click();
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		pay.click();
		
		WebElement order = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		order.click();


		TakesScreenshot ts = (TakesScreenshot) driver;
		
	   File source = ts.getScreenshotAs(OutputType.FILE);
	  	 
	   File des = new File("C:\\Users\\De\\eclipse-workspace\\Selenium\\SC\\dress.png");
	  	 
	   FileUtils.copyFile(source, des);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}
