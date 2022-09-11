//wasptp all options present in mtr listbox
package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllOptionsOfMTRlist {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement mtrLstBx = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrLstBx);// is a class used get the list of all items
		List<WebElement> allOptions = s.getOptions();//.getOptions() is a method used to get the all options of mtrlist.
		int count = allOptions.size();
		System.out.println(count);

		 for(WebElement i:allOptions)
			System.out.println(i.getText());
		driver.close();
	}}  
		
		
		/*for (int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}}*/