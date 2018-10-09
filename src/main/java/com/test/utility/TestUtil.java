package com.test.utility;

import java.util.ArrayList;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try
		{
			reader = new Xls_Reader("F:\\JavaSeleniumFramework\\testngConcepts\\src\\main\\java\\HalfEbayTestData.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum=1;rowNum <= reader.getRowCount("RegTestData");rowNum++)
		{
				String firstName = reader.getCellData("RegTestData",0,rowNum);
				String lastName = reader.getCellData("RegTestData",1,rowNum);
				String address1 = reader.getCellData("RegTestData",2,rowNum);
				String address2 = reader.getCellData("RegTestData",3,rowNum);
				String city = reader.getCellData("RegTestData",4,rowNum);
				String state = reader.getCellData("RegTestData",5,rowNum);
				String zipCode = reader.getCellData("RegTestData",6,rowNum);
				String emailAddress = reader.getCellData("RegTestData",7,rowNum);
				
				Object[] obj = {firstName,lastName,address1,address2,city,state,zipCode,emailAddress};
				myData.add(obj);
				
		}
		return myData;
	}	

}
