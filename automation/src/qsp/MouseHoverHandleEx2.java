package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandleEx2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("//span[contains(text(),'Solutions')]"));

		Actions a=new Actions(driver);
		a.moveToElement(resources).build().perform();
		driver.findElement(By.linkText("(//a[contains(text(),'For Startups')])[1]")).click();
		String txt = driver.findElement(By.partialLinkText("The perfect CRM for startups")).getText();
		System.out.println(txt);
		driver.close();
	}

}
