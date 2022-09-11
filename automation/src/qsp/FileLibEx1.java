package qsp;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibEx1 {

	public String getpropertyData(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/CommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data1 = p.getProperty(Key);
		return data1;
	}
	public String getExcelData(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data2 = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data2;
	}}

