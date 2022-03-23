package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {
	
	public static void main(String[] args) throws AWTException

	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver dr = new ChromeDriver();	
	
	dr.get("https://www.amazon.in/");
	
	WebElement src = dr.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions rc = new Actions(dr);
		
	rc.contextClick(src).build().perform();
	
	Robot rob = new Robot();
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
		
}
	


}
