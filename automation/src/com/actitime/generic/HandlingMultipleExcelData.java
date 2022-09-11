//wast read multiple data from excel (using for loop or nested for loop).
package com.actitime.generic;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class HandlingMultipleExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get last row number where the data is present.
		int rowCount = wb.getSheet("Sheet2").getLastRowNum();
		short cellCount = wb.getSheet("Sheet2").getRow(0).getLastCellNum();
		for(int i=1;i<=rowCount;i++) {
			String un = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+ "===>"+ pw);
			} 
		
		/*for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
			String un = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+ "===>"+ pw);
			}}*/
	}}
