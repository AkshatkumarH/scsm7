//wastp the 1st selected option in checkpost listbox
package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement CheckPostLstBx = driver.findElement(By.id("cp"));	
		Select s=new Select(CheckPostLstBx);
		WebElement FSOption = s.getFirstSelectedOption();
		String text = FSOption.getText();
		System.out.println(text);
		driver.close();
	}}
