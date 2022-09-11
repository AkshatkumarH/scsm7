package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChidWindowEx {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();;
		driver.findElement(By.id("login-facebook-button")).click();;
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		
		for(String wh:allwh) {
			System.out.println(wh);
		}
		driver.quit();
		}}
		
