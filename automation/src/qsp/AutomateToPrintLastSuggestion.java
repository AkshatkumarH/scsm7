package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateToPrintLastSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//goto flipkart.com
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//type java in the search textbox
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);//used for synchronization 
		//find all the autosuggestion & print the count
		List<WebElement> allsugg = driver.findElements(By.xpath("(//div[2]/form/ul/li/div)//a"));
		int count = allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(count-1).click();
	}}