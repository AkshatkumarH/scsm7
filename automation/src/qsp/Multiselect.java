//wspt selct idly vada dosa and deselect it.

package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Multiselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement mtrbxlst = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrbxlst);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("v");
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");
		Thread.sleep(1000);
		boolean status = s.isMultiple();
		if (status==true)
			System.out.println("list box is : MultiSelect Listbox");
		Thread.sleep(1000);
		System.out.println(status);
		Thread.sleep(1000);
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByValue("d");
		Thread.sleep(1000);
		s.deselectByVisibleText("idly");
		driver.close();
	}}


