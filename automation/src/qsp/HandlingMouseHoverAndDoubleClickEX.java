package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHoverAndDoubleClickEX {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resources).build().perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement target = driver.findElement(By.linkText("READ FULL STORY"));
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250");
		Thread.sleep(3000);
		a.doubleClick(target).perform();

		String url = driver.getCurrentUrl();

		if(url.contains("hackerearth")) {
			System.out.println("hackerearth page is present");
		}
		else
			System.out.println("hackerearth page is not present");
		driver.quit();
	}}