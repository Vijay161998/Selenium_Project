package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Page {

	public static void main(String[] args) throws AWTException {	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();	

		dr.get("https://www.amazon.in/");////a[text()='Mobiles']

		Actions act = new Actions(dr);

		WebElement mob = dr.findElement(By.xpath("//a[text()='Mobiles']"));

		act.contextClick(mob).build().perform();

		Robot key = new Robot();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);//

		WebElement ele = dr.findElement(By.xpath("//a[text()=' Electronics ']"));

		act.contextClick(ele).build().perform();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

		WebElement book = dr.findElement(By.xpath("//a[text()='Books']"));

		act.contextClick(book).build().perform();

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);

		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);


		String s1 = dr.getWindowHandle();
		System.out.println(s1);

		Set<String> s2 = dr.getWindowHandles();
		for (String string : s2) {

			System.out.println(string);
		} 
		for (String strings : s2) {


			String title=dr.switchTo().window(strings).getTitle();

			System.out.println(title);	//

		}
		String s3 = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in\r\n" ;

		for (String string1 : s2) {

			if(dr.switchTo().window(string1).getTitle().equals(s3));
			{
				System.out.println("done");
				break;
			}

		}

	}
}

