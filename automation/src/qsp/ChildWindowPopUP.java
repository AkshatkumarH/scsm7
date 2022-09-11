package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ChildWindowPopUP {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		driver.close();
	}}
