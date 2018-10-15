package com.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSampleTests {
	
	WebDriver driver;
	Logger log = Logger.getLogger(GoogleSampleTests.class);
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
		log.info("*******Launching chrome Browser**********");
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		driver.get("http://www.google.com");
 		log.info("********Navigating to application************");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{	
		log.info("************ Starting Google Title Test **************");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","Title is not matched");
		log.info("************ Ending Google Title Test **************");
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest()
	{
		log.info("************ Starting Google Logo Test **************");
		boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b,"Logo is not displayed");
		log.info("************ Ending Google Logo Test **************");
	}
	
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest()
	{
		log.info("************ Starting Google mailLink Test **************");
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(b);
		log.info("************ Ending Google mailLink Test **************");
	}
	
	@AfterMethod
	public void tearDown()
	{
		log.info("************ Closing browser **************");
		driver.quit();
	}
	
	
	
	

}
