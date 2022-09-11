package qsp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandleHiddenDivisionWithoutUsingSendkeysEx3 {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement monthbox = driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])"));
		Select s1=new Select(monthbox);
		List<WebElement>alloptions1=s1.getOptions();
		s1.deselectByIndex(7);
		
		WebElement yearbox = driver.findElement(By.xpath("(//select[@class='ui-datepicker-year'])"));
		Select s2=new Select(yearbox);
		List<WebElement> alloptions2=s2.getOptions();
		s2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//a[text()=09]")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("8105520073");
		driver.findElement(By.id("renew_policy_submit")).click();
		
    	WebElement errormsg=driver.findElement(By.id("policynumberError"));
		if(errormsg.isDisplayed()) {
			System.out.println("Displaying an Error MSG : Test is passed");
		}
		else
		System.out.println("not Displaying an Error MSG : Test is Failed");
	}}