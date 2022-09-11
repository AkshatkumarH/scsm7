//wastp allthe selected option present in checkpost
package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllSelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement CheckPostLstBx = driver.findElement(By.id("cp"));	
		Select s=new Select(CheckPostLstBx);
		Thread.sleep(1000);
		List<WebElement> AllOptions = s.getAllSelectedOptions();
		int count = AllOptions.size();
		System.out.println(count);

		for(WebElement i:AllOptions)
			System.out.println(i.getText());
		driver.close();
	}}

/*   for (int i=0;i<count;i++) {
			Thread.sleep(1000);
			String text = AllOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}}   */
