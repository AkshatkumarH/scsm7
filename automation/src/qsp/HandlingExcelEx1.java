package qsp;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To get the java reprentative object/resource of physical file.
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		//Create the workbook or open excel.
		Workbook wb=WorkbookFactory.create(fis);
		//get the control of the sheet, row, cell & read the data.
		String data = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//To print the data on the console.
		System.out.println(data);
		wb.close();
	}}
