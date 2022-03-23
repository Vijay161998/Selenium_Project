package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	
public static void main(String[] args) throws Throwable { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		WebElement mul = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		mul.click();
		
		
		 WebElement findElement = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		WebElement findElement1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));	
		
		WebElement ir = driver.findElement(By.xpath("(//input[@type='text'])"));
		
		ir.sendKeys("vijay");
	
}
}