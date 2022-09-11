//wasp to close all brosers present in indeed.com
//after clicking Apple&FB button withou using quit method.
//*** v.v imp prog.
package qsp;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowsWithoutQuitMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();;
		driver.findElement(By.id("login-facebook-button")).click();;
		Set<String> allwh = driver.getWindowHandles();//used to get all the address of window

		for(String wh:allwh) {
			driver.switchTo().window(wh);// used to switch the address
			driver.close();// here we use this to close all windows without using quit() method.
		}}}

