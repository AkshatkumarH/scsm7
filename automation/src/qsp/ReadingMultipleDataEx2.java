package qsp;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataEx2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of sheet.
		Sheet sheet = wb.getSheet("Sheet1");
		//get the control of row.
		Row row = sheet.getRow(2);
		//get the control of cell.
		Cell cell = row.getCell(2);
		//get the control of data inside the cell and to print.
		System.out.println(cell.getStringCellValue()); 	
	}}
