package com.actitime.generic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is generic calss for data driven testing.
 * @author AKSHAY
 * 
 */

public class GenericLibraryEx {
	/**
	 * This is generic for reading the data from property file.
	 * @param args\
	 * @return String
	 * @throws IOException 
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/CommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data1 = p.getProperty(key);
		return data1;
	}
	/**
	 * This is a generic method for reading the data from excile file
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String getExcelData(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data2 = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data2;
	}
	/**
	 * this is a generic method to write the data from Excel file.
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void SetExcelData(String SheetName, int row, int cell, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
		wb.write(fos);
		//wb.close();
	}}
