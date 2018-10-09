package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void LoginTest()
	{
		System.out.println("Login test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void HomepageTest()
	{
		System.out.println("HomePage test");
	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("Search test");
	}
	

}
