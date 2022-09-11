package com.actitime.generic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of sheet, row, cell, and then type the value
		wb.getSheet("Sheet1").getRow(3).getCell(0).setCellValue("tc-03");
		wb.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("CreateCustomer3");
		wb.getSheet("Sheet1").getRow(3).getCell(2).setCellValue("CNRB-003");
		wb.getSheet("Sheet1").getRow(3).getCell(3).setCellValue("bankingProject3");
		wb.getSheet("Sheet1").getRow(3).getCell(4).setCellValue("deferred");
		//convert the java representative object into physical file format.
		FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
		//save the workbook or file.(actual writing happens here).
		wb.write(fos);
		//wb.close();
	}}
