package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToTopOfWebpageFromBottom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //the method inside the executeScript used to scroll any webpage to bottom/last.
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,document.body.scrollTop)");
		//j.executeScript("window.scrollTo(0,0)");//the method inside the executeScript used to scroll any webpage to Top of webpage.
	}}


