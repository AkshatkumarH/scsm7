package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleHiddenDivisionOrCalenderPopupEx2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		driver.findElement(By.id("policynumber")).sendKeys("123"+Keys.ENTER);
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.id("dob")).sendKeys("09/01/1985"+Keys.ENTER);
		driver.findElement(By.id("alternative_number")).sendKeys("8105520073"+Keys.ENTER);
		driver.findElement(By.id("renew_policy_submit")).click();
	}}