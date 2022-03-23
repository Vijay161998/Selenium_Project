package com.projects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Runner_Class_Adactin {


	public static void main(String[] args) throws Throwable {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();


		WebElement name =driver.findElement(By.id("username"));
		name.sendKeys("VijayVijay11");

		WebElement pass =driver.findElement(By.id("password"));
		pass.sendKeys("Arani@0130");
		
		WebElement login =driver.findElement(By.id("login"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select s = new Select(location);
		
		s.selectByValue("Melbourne");

		WebElement hotel =driver.findElement(By.id("hotels"));
         Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		
		WebElement roomtype =driver.findElement(By.id("room_type"));
        Select s2 = new Select(roomtype);
		s2.selectByValue("Standard");


		WebElement room =driver.findElement(By.id("room_nos"));
		Select s3 = new Select(room);
		s3.selectByValue("1");
		
		WebElement cd =driver.findElement(By.name("datepick_in"));
		cd.sendKeys("27/02/2022");
		
		WebElement co =driver.findElement(By.name("datepick_out"));
		co.sendKeys("01/03/2022");
		
		WebElement adu = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adu);
		s4.selectByIndex(1);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		radio.click();
		
		WebElement con = driver.findElement(By.name("continue"));
		con.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		WebElement fn =driver.findElement(By.id("first_name"));
		fn.sendKeys("vijay");
		
		WebElement la =driver.findElement(By.id("last_name"));
		la.sendKeys("R");

		WebElement add =driver.findElement(By.id("address"));
		add.sendKeys("chinna  sayakara street");
		
		WebElement cc =driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234123412341234");
		
		WebElement ccnum =driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccnum);
		s6.selectByIndex(1);
		
		WebElement mon =driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(mon);
		s7.selectByIndex(4);
		
		WebElement year =driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2022");
		
		WebElement cvv =driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		
		WebElement book =driver.findElement(By.id("book_now"));
		book.click();
		
		WebElement in =driver.findElement(By.id("my_itinerary"));
		in.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
	   File source = ts.getScreenshotAs(OutputType.FILE);
	  	 
	   File des = new File("C:\\Users\\De\\eclipse-workspace\\Selenium\\SC\\error3.png");
	  	 
	   FileUtils.copyFile(source, des);

		
	}



}



