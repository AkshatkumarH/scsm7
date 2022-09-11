package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WiprojobsURLsEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//open the browser
		driver.get("https://www.google.com");
		//type qspiders in the search textbox
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(5000);//used for synchronization 
		//find all the suggestions and print the count
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allLinks.get(i).getAttribute("href");
			System.out.println(text);
		}
		driver.close();
	}}
