//waspt handle drag and drop
package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingDragAndDropEx1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/index.html?whichScript=dg-crop");
		WebElement source = driver.findElement(By.xpath("//div[@class='dg-movable']"));
		WebElement target = driver.findElement(By.xpath("(//div[@class='dg-crop-shadow'])[2]"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(source, target).perform();;
	}}