package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParticularColumn {

public static void readParticularColumn() throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_Practice\\Student.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);            //Upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
		 
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			//int numberOfCells = row.getPhysicalNumberOfCells();
				
				Cell cell = row.getCell(1);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double value = cell.getNumericCellValue();
					int num = (int) value;       //Narrowing type casting
					System.out.println(num);
				}
			}	
		}
	
	public static void main(String[] args) throws IOException {
		readParticularColumn();
		
	}
}
    


