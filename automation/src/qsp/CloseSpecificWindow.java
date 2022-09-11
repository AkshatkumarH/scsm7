//wasp to close Specific window/browser present in indeed.com
//In this prog we use scanner class to ask user to enter the specific window that he want to close

package qsp;
import java.util.Set;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseSpecificWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the Title to be Closed : ");
		String eTitle = s.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();//used to get all the address of window

		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String aTitle = driver.getTitle();

			if(aTitle.contains(eTitle)) {   // aTitle & aTitle means actual & expected Title
			driver.close();
			}}}}

