package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;


public class New_Account {
	
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	
	create.click();
	
	Thread.sleep(3000);
	
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("vijay");
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	lastname.sendKeys("Rajendiran");
	
	WebElement mail = driver.findElement(By.name("reg_email__"));
	mail.sendKeys("ruvijay1998@gmail.com");
	
	WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
	remail.sendKeys("ruvijay1998@gmail.com");
	
	WebElement pass = driver.findElement(By.id("password_step_input"));
	pass.sendKeys("8124055");
	
	
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select s = new Select(day);
	s.selectByValue("16");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select s1 = new Select(month);
	s1.selectByValue("8");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select s2 = new Select(year);
	s2.selectByValue("1998");
	
	
 WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
 gender.click();
    
  //TakesScreenshot ts = (TakesScreenshot) driver;
	
  	// File source = ts.getScreenshotAs(OutputType.FILE);
  	 
  	// File des = new File("C:\\Users\\De\\eclipse-workspace\\Selenium\\SC\\error1.png");
  	 
  	// FileUtils.copyFile(source, des);
  	
	
	
		
	}

}
