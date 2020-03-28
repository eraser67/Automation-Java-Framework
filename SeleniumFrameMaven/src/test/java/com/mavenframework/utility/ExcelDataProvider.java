package com.mavenframework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() {

		File src = new File("./TestData/TestData.xlsx");

		try {

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		}

		catch (Exception e) {
			System.out.println("Unable to read Excel File " + e.getMessage());
		}

	} 

	
	  public String GetStringData(int SheetIndex, int row, int column) {
	  
	  return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	  
	  }
	 

		/*
		 * public String GetStringData(String SheetName, int row, int column) {
		 * 
		 * return wb.getSheet(SheetName).getRow(row).getCell(row).getStringCellValue();
		 * 
		 * }
		 */
	public XSSFCell GetNumericData(String SheetName, int row, int column) {

		return wb.getSheet(SheetName).getRow(row).getCell(column);

	}

}
