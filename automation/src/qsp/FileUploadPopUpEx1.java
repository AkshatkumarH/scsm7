package qsp;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FileUploadPopUpEx1 {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/Naukri.html");
		//convert the relative path to absolute path.
		File f=new File("./data/Akshat resume.docx");
		String absolutepath = f.getAbsolutePath();
		//pass the absolute path as an argument for sendkeys method.
        driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}}
