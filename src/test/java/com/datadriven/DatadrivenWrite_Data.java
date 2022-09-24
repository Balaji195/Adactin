package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class DatadrivenWrite_Data {
	
	private static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_Practice\\Student.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheet = w.createSheet("Students");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("Surya");
		
		w.getSheet("Students").getRow(0).createCell(1).setCellValue("1995");
		
		w.getSheet("Students").createRow(1).createCell(0).setCellValue("Balaji");
		
		w.getSheet("Students").getRow(1).createCell(1).setCellValue("1308");
		
		w.getSheet("Students").createRow(2).createCell(0).setCellValue("kalai");
		
		w.getSheet("Students").getRow(2).createCell(1).setCellValue("1991");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
	}

	public static void main(String[] args) throws IOException {

		writeData();
	}

}

