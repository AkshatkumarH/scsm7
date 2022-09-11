package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintText {
static{
       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://demo.actitime.com/");
	Thread.sleep(2000);
	String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	Thread.sleep(2000);
	System.out.println(text);
	driver.close();
}}
