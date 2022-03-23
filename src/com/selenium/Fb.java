package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Fb {

	
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//	WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		
		//name.sendKeys("vijay");
		
		//WebElement password = driver.findElement(By.id("pass"));
		
		//password.sendKeys("81240");
		
		//WebElement findElement = driver.findElement(By.name("login"));
		
		//findElement.click();//a[text()='Create New Account']		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'and')]"));
		System.out.println(text.getText()); 
		
		WebElement text1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		System.out.println(text1.getText()); 
				
		//driver.close();
		//driver.quit();
		
	}
}
