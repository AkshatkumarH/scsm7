package qsp;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadResumeToNaukriEx2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		File f=new File("./data/Akshat resume.docx");
		String abs = f.getAbsolutePath();
		System.out.println(abs);
		driver.findElement(By.id("cv")).sendKeys(abs);
	}}