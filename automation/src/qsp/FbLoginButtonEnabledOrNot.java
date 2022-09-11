package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginButtonEnabledOrNot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean text = driver.findElement(By.name("login")).isEnabled();
		if(text==true) {
			System.out.println("login button is enabled");
		}
		else
			System.out.println("login button is not enabled");
	}}