package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintCssValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement href_link = driver.findElement(By.linkText("Forgotten password?"));
	String color = href_link.getCssValue("color");
	String fontSize = href_link.getCssValue("font-size");
	String fontWeight = href_link.getCssValue("font-weight");
	System.out.println(color);
	System.out.println(fontSize);
	System.out.println(fontWeight);
}}

