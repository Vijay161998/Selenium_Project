package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Buttons {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
   
   WebDriver driver = new ChromeDriver();
   
   driver.get("https://demoqa.com/buttons");
   
   WebElement d = driver.findElement(By.id("doubleClickBtn"));
   
   Actions act =  new Actions(driver);
   
   act.doubleClick(d).build().perform();
  
   WebElement r = driver.findElement(By.id("rightClickBtn"));
   
   Actions rc = new Actions(driver);
   rc.contextClick(r).build().perform();
   
   WebElement c = driver.findElement(By.xpath("//button[text()='Click Me']"));
    
   Actions cl = new Actions(driver);
   cl.click(c).build().perform();
   
}
}