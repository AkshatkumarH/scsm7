package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XnYaxisOfEmailTxtBx {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");	
int X = driver.findElement(By.id("email")).getLocation().x;
int Y = driver.findElement(By.id("email")).getLocation().y;
System.out.println(X);
System.out.println(Y);
	}}
