package qsp;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOfAllBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();;
		driver.findElement(By.id("login-facebook-button")).click();;
		Set<String> allwh = driver.getWindowHandles();//used to get all the address of window
		int count = allwh.size();
		System.out.println(count);

		for(String wh:allwh) {
			//System.out.println(wh); //used to print all the address of window along with respective title
			driver.switchTo().window(wh);// used to switch the address
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}}
