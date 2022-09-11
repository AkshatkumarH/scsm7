//wast type a b c d int1 and t2 textbox alternatively character by caracter.
package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesUsingStringEx2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Selenium%20S.W/New%20folder/HandlingFrames_Page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");  // 1st frame passing String type as frame
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();   //2nd frame passing defaultContent(), means directly it is going back to parent one.
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(1000);
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frm);    //3rd frame passing refernce webElement 
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.close();
	}}

