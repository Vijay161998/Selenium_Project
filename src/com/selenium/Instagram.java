package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	
	Thread.sleep(1000);
	
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	
	username.sendKeys("vijay");
	
	WebElement password = driver.findElement(By.name("password"));
	
	password.sendKeys("1234567");
	
	WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	  
	//driver.close();
	
	}

}
