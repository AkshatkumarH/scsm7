//wast type jsp in t2 textbox and qsp in t1 textbox
package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Selenium%20S.W/New%20folder/HandlingFrames_Page1.html");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
        driver.findElement(By.id("t2")).sendKeys("jsp");
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.findElement(By.id("t1")).sendKeys("qsp");
        driver.quit();
	}

}
