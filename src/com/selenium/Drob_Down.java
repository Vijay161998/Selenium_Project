package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drob_Down {
	
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\Driver1\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();	
		   
		   Actions find = new Actions(driver);
		   
		   WebElement findElement = driver.findElement(By.xpath("//span[.='Best Sellers in Toys & Games']"));
			
		    
		   find.moveToElement(findElement).build().perform();
	}
}
