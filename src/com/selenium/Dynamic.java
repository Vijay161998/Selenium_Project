package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/myntra-fashion-store?f=Brand%3AU.S.%20Polo%20Assn.%2CU.S.%20Polo%20Assn.%20Denim%20Co.%2CU.S.%20Polo%20Assn.%20Kids%2CU.S.%20Polo%20Assn.%20Tailored%2CU.S.%20Polo%20Assn.%20Women%3A%3AGender%3Amen%2Cmen%20women&rf=Discount%20Range%3A30.0_100.0_30.0%20TO%20100.0");

		//

		List<WebElement> price = driver.findElements(By.xpath("//span [@class ='product-strike']//ancestor::div[@class='product-price']"));

		for (WebElement li : price) {

		System.out.println(li.getText());   
		
		//used to retrive dis count  and origina amount
			
		}

		List<WebElement> orprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
			
		List<Object> s = new ArrayList<>();
		
		for (WebElement or : orprice) {
		
		String replace = or.getText().replace("Rs. ","");
		
		   int parseInt = Integer.parseInt(replace);	

			s.add(parseInt);
			//used to retrive dis count amount
			
		}
		System.out.println(s);
	
			//(//span[@class='product-discountedPrice'])[2] and use web element to get single value
	}

}
