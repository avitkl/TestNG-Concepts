package com.test.utility;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Xls_Reader {
	
	String FilePath=null;
	Workbook wb=null;
	
	
	public Xls_Reader(String FilePath)
	{
		this.FilePath=FilePath;
		try
		{
		FileInputStream inputStream = new FileInputStream(this.FilePath);
		wb=new XSSFWorkbook(inputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int getRowCount(String sheetName)
	{
		Sheet sheet =wb.getSheet(sheetName);
		return sheet.getLastRowNum()-sheet.getFirstRowNum();
	}
	
	public int getColumnCount(String sheetName,int rowNum)
	{
		Sheet sheet =wb.getSheet(sheetName);
		Row row= sheet.getRow(rowNum);
		return row.getLastCellNum()-row.getFirstCellNum();
	}
	
	public String getCellData(String sheetName,int colNum,int rowNum)
	{
		Sheet sheet =wb.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
        Cell cell=row.getCell(colNum);
        return cell.getStringCellValue();	
	}

}
