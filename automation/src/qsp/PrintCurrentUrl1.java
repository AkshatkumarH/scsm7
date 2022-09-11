package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCurrentUrl1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String Url=driver.getCurrentUrl();
		
		if(Url.endsWith("https://www.selenium.dev/"))
		{
			System.out.println("pass, succesful url");
		}
		else {
			System.out.println("fail, unsuccesful url");
		}
		driver.close();
	}}
