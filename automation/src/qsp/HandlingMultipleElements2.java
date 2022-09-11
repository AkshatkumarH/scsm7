package qsp;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the URL : ");
		String url=s.nextLine();

		WebDriver driver=new ChromeDriver();
		driver.get(url);	
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));	
		int count = allLinks.size();
		System.out.println(count);
		for(WebElement e: allLinks)
			System.out.println(e.getText());
	}}
