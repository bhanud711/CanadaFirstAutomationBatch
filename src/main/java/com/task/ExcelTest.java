package com.task;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {
	@Test
	public void data() throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook(".//Excel//Test.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();  //27
		int colcount = sheet.getRow(1).getLastCellNum(); //160
		
	for(int i=1;i<=rowcount;i++)
	{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<=colcount;j++)
		{
			try {
				String cellValue= row.getCell(j).getStringCellValue();
				 System.out.print(cellValue+" ");	
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			 
		}
		
	}
	book.close();
		
	}

}
