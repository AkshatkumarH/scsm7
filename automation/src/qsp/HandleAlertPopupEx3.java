package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleAlertPopupEx3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open browser
		WebDriver driver=new ChromeDriver();
		//go to- https://demo.automationtesting.in/Alerts.html
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//click on Alert with OK & cancel button
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		//click on confirmbox button
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//To handle- UnHandledAlertException
		driver.switchTo().alert().dismiss();
		//press cancelbutton on the Pop-Up
		driver.findElement(By.id("demo")).click();
		driver.close();
	}}
