package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSampleTests {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{	
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","Title is not matched");
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b,"Logo is not displayed");
	}
	
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("GMail")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
