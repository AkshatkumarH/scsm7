package qsp;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingInExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To get the java reprentative object/resource of physical file.
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		//Create the workbook or open excel.
		Workbook wb=WorkbookFactory.create(fis);
		//get the control of the sheet, row, cell & read the data.
		wb.getSheet("Sheet1").getRow(2).getCell(0).setCellValue("tc-02");
		wb.getSheet("Sheet1").getRow(2).getCell(1).setCellValue("CreateCustomer2");
		wb.getSheet("Sheet1").getRow(2).getCell(2).setCellValue("IDBC_002");
		wb.getSheet("Sheet1").getRow(2).getCell(3).setCellValue("BankingProject2");
		wb.getSheet("Sheet1").getRow(2).getCell(4).setCellValue("Fail");
		//To get the java reprentative object/resource of physical file.
		FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
		//Create&Save the workbook or open excel in edit/wri.
		wb.write(fos);
		//To print the data on the console.
		System.out.println(fos);
		//wb.close();
	}}
