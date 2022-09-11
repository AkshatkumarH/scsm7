//wast print address of all the Tabs opened by actiTIME after clicking actiTIME.Inc link, along with count
package qsp;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actiTime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> allTabs = driver.getWindowHandles();
		int count = allTabs.size();
		System.out.println(count);

		for(String wh:allTabs) {
			System.out.println(wh);
		}
		driver.quit();	
	}}
