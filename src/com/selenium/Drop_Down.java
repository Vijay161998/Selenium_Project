package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	

   public static void main(String[] args) {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");
	   
	   WebElement dropdown = driver.findElement(By.name("coffee2"));
	   
	   System.out.println("***Use to getAllSelectedOptions****");
	   Select s = new Select(dropdown);
	   
	   boolean multiple = s.isMultiple();
	   
	   System.out.println(multiple);
	   
	   s.selectByValue("skim"); 
	 
	   s.selectByValue("milk2");
	   s.selectByValue("cream");
	  
	   List<WebElement> select = s.getAllSelectedOptions();
	   
	   for (WebElement webElement : select) {
		   
		   System.out.println(webElement.getText());
		
		 		   
	   }
		 
	   System.out.println("***Use to getOpions***");

	   
	List<WebElement> all = s.getOptions();  
	
	for (WebElement webElement2 : all) {
		
		System.out.println(webElement2.getText());
		
	}
	
	System.out.println("****************************");
		
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	
		System.out.println(firstSelectedOption.getText());
		
	}
	
}


