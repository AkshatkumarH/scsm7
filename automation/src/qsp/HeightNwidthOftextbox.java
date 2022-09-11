package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightNwidthOftextbox {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com//");
WebElement actTbx1 = driver.findElement(By.id("username"));
int H1 = actTbx1.getSize().getHeight();
int W1 = actTbx1.getSize().getWidth();
System.out.println("Height of UN textbox is = "+H1+" pxl");
System.out.println("Width of UN textbox is = "+W1+" pxl");
WebElement actTbx2 = driver.findElement(By.name("pwd"));
int H2 = actTbx2.getSize().getHeight();
int W2 = actTbx2.getSize().getWidth();
System.out.println("Height of pwd textbox is = "+H2+" pxl");
System.out.println("Width of pwd textbox is = "+W2+" pxl");
driver.close();
	}}
