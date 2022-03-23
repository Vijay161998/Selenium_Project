package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Alert {
	
	public static void main(String[] args) throws Throwable { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		//WebElement alert = driver.findElement(By.id("alertButton"));
		
		//alert.click();
		
		
		//driver.switchTo().alert().accept();
		
		
		//WebElement ca = driver.findElement(By.id("confirmButton"));
	    //ca.click();
	    ///driver.switchTo().alert().dismiss();
	    
	    WebElement pb = driver.findElement(By.id("promtButton"));
	    pb.click();
	    Thread.sleep(100);
         
	  driver.switchTo().alert().sendKeys("vijay");
	    
	  driver.switchTo().alert().accept();
	   
	     
	}

}
