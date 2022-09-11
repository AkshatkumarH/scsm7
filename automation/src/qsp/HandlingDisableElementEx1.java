//wast pass admin in UN textbox & manager in PWD textbox.
package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElementEx1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/disabled.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		//Here we are using downCasting method.
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='manager'");
		
		
		//Here we are using TypeCasting method.
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("document.getElementById('d2').value='manager'");
		//driver.close();
	}}
