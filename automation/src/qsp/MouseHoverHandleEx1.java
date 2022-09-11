package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandleEx1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));

		Actions a=new Actions(driver);
		a.moveToElement(resources).build().perform();
		driver.findElement(By.linkText("Contact Us")).click();
		String Pno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..")).getText();
		System.out.println(Pno);
		driver.close();
	}}