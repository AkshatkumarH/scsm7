package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginToFBtextMSGtoSomeone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8105520073");
		driver.findElement(By.name("pass")).sendKeys("akshay/123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("(//div[@aria-label=\"Messenger\"])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type=\"search\"])[2]")).sendKeys("Charishma Koduru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@aria-label='Message'])[1]")).sendKeys("hello chi chi chi Reeshmaaa "+Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='Close chat']")).click();
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//div[@aria-label='Close]")).click();
		//driver.findElement(By.xpath("span[contains(text(),'Photo')]")).getClass();
	}}