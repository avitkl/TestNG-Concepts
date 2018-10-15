package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	//Precondition annotations -- starting with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch chrome Browser");
	}
	
	@BeforeClass
	public void login() 
	{
		System.out.println("Login to app");
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("Enter the URL");
	}	
	
	//test cases -- starting with @Test
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search test");
	}
	
	//Pre-condition annotations -- starting with @After
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout from app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("DeleteAllCookies");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate report");
	}
	
}
