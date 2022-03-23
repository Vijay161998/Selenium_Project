package com.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	
	
	public static void main(String[] args) throws AWTException

	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
	
	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//js.executeScript("window.scrollBy(0,9000);");
	//js.executeScript("window.scrollBy(0,-4500);");
			
	WebElement findElement = driver.findElement(By.xpath("//h2[text()='Pay your credit card bills on Amazon']"));
	
	js.executeScript("arguments[0].scrollIntoView();",findElement);
	
	}
	

}
