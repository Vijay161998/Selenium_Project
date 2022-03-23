package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1TfITc9OV2A0YHRg8GJLzE2sys8DAELoBhw&q=amazon&oq=am&aqs=chrome.1.69i57j46i131i199i433i465i512j0i433i512l2j0i131i433i512j0i131i433j0i131i433i512j0i512j0i433i512.3276j0j7&sourceid=chrome&ie=UTF-8");

		//String title = driver.getTitle();
		//System.out.println("the title is");
		//System.out.println(title);
		
		
		//driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.google.com/search?q=google&rlz=1C1CHBF_enIN990IN990&oq=google&aqs=chrome..69i57.6991j0j7&sourceid=chrome&ie=UTF-8");
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		//	driver.navigate().back();
	
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//driver.close();
		
		
			}

}
