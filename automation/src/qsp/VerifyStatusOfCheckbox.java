package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyStatusOfCheckbox {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean text = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(text==true) {
			System.out.println("text is selected");
		}
		else
			System.out.println("text is not selected");
	}}
