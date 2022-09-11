package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureAutosuggetionOfQspiders {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//open the browser
		driver.get("https://www.google.com");
		//type qspiders in the search textbox
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(5000);//used for synchronization 
		//find all the suggestions and print the count
	List<WebElement> allsuggsn = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		Thread.sleep(3000);
		int count = allsuggsn.size();
		System.out.println(count);

		/*for(int i=0;i<count;i++) {
			String text = allsuggsn.get(i).getText();
			System.out.println(text);
		}*/

		for(WebElement i:allsuggsn)
			System.out.println(i.getText());
		allsuggsn.get(count-1).click();//used to click on 1st suggestion  
		driver.close();

	}

}
