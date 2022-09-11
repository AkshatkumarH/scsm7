//wasptp all options present in mtr listbox without duplicates/repeated.
package qsp;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllOptionswithouDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement mtrLstBx = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrLstBx);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		List<String> nameList=new ArrayList<>(Arrays.asList(""));
		Set<String> no_dups=new HashSet<>(nameList);
		System.out.println(no_dups);
		for(WebElement i:allOptions)
			System.out.println(i.getText());

	}}
