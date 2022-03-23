package com.converation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alternatives {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\Driver1\\chromedriver.exe"); 

		//alternative for System.setProperty is set a Environment Variable for chrome path
		
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.facebook.com/");//alternative for get method

		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement email = driver.findElement(By.name("email"));		 

		js.executeScript("arguments[0].value='vijay1998@gmail.com'",email);//alternative for Send Keys

		WebElement pass = driver.findElement(By.name("pass"));		 

		Actions action = new Actions(driver);
		action.sendKeys(pass,"vijay").perform();//alternative for Send Keys

		WebElement log = driver.findElement(By.name("login"));
		//log.click();
		log.sendKeys(Keys.ENTER); //alternative for Click

		//log.sendKeys(Keys.RETURN);//alternative for Click

		driver.get(driver.getCurrentUrl());//alternative for refresh
		
		driver.navigate().to(driver.getCurrentUrl());//alternative for refresh

	}

}
