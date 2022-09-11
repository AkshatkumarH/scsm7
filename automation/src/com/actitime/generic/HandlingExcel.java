//wast read the data from excel.
package com.actitime.generic;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get the java representative or phyical file.
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		//load the file or create a workbook.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, row, & cell then read the data.
		String data = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
	}}
