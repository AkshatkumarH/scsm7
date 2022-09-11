package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPhonesNamesWithPrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("APPLE iPhone 13 Pro Max"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> phnlists = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		int count = phnlists.size(); 
		Thread.sleep(3000);
		System.out.println(count);
        
		for(WebElement i:phnlists) {
			System.out.println(i.getText());
		}

		List<WebElement> pricelists = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]"));
		for(WebElement j:pricelists) {
			System.out.println(j.getText());
		}
		
	}}	


