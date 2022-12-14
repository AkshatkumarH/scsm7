package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadWithin7secOrNotEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(14, TimeUnit.SECONDS);//driver.manage().timeouts().pageLoadTimeout(14, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/");
			System.out.println("page is getting loaded within 14-sec's");//7secs
		}
		catch(TimeoutException e) {
			System.out.println("page is not getting loaded within 14-sec's");//7secs
			driver.close();
		}}}