package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotationTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailId"})
	public void yahooLoginTest(String browser,String url,String emailId)
	{
		if(browser=="chrome")
		{
			
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
 		driver=new ChromeDriver();
 		driver.get(url);
 		
 		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
 		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId);
 		
 		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
 		
 		driver.quit();
		}
		
	}
	
	

}
