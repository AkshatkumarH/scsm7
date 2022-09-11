package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllOptionsWithoutUsingLoopingStmnts {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement mtrLstBx = driver.findElement(By.id("mtr")) ;
		Select s=new Select(mtrLstBx);
		WebElement allOption = s.getWrappedElement();
		
		String text = allOption.getText();
		System.out.println(text);
		driver.close();
	}}
