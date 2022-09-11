package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFbLoginButon {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String name = driver.findElement(By.name("login")).getText();
		//String id = driver.findElement(By.id("u_0_5_Xj")).getText();
		String tagName = driver.findElement(By.tagName("button")).getText();
        System.out.println(name);
       // System.out.println(id);
        System.out.println(tagName);
        driver.close();
	}}