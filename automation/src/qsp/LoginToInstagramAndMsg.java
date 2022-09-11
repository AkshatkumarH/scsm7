package qsp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LoginToInstagramAndMsg {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("akshatakumarh@gmail.com"+Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("akshay/2662"+Keys.ENTER);
		driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@aria-label='Direct messaging - 1 new notification link']")).click();//(//a[@role='link'])[3] 
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("_.silent_._.killer_");
		driver.findElement(By.xpath("(//div[contains(text(),'.silent_._.killer_')])")).click();
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Hellow are you free in night");
		driver.findElement(By.xpath("//button[text()='Send']")).click();

	}}