package com.shopperstack.file.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	Java_Utility javautility= new Java_Utility();
	public String readdatafrompropertyfile(String keys) throws IOException {
		FileInputStream fis=new FileInputStream(FrameworkConstants.propertyFilePath);
		Properties pro=new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(keys);
		return value;
	}
	
	
	
	public String readdatafromexcelfile(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(FrameworkConstants.excelFilePath);
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		
	}

}
