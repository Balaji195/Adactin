package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_project {
	public static String value;
	public static void readAllData() throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_New\\Student.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
 //Interface Class        
		Workbook w = new XSSFWorkbook(fis);            //Upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
		
		System.out.println("***All Data***");
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	//Outer Loop	
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
		//Inner Loop	
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double num = cell.getNumericCellValue();
					int digit = (int) num;                                    //Narrowing type casting
					value = Integer.toString(digit); 
					System.out.println(value);
				}
			}	
		}
	}
	
	private static void particularData() throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_New\\Student.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		System.out.println("***Particular Data***");
		
		if (cellType.equals(CellType.STRING)) {
			
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		 else if (cellType.equals(CellType.NUMERIC)) {
			
			double num = cell.getNumericCellValue();
			int value = (int) num;
			System.out.println(value);
		}	

	}
	public static void main(String[] args) throws IOException {
		readAllData();
		particularData();
	}
}
  

