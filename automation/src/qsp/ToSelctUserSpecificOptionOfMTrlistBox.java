package qsp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ToSelctUserSpecificOptionOfMTrlistBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Item Name : ");
		String order = sc.nextLine();

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20S.W/New%20folder/BreakfastListBox.html");
		WebElement mtrLstBx = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrLstBx);
		List<WebElement> option = s.getOptions();
		ArrayList<String> a=new ArrayList<String>();

		for (int i=0;i<option.size();i++) {
			String optionName = option.get(i).getText();
			a.add(optionName);
		}
		if(a.contains(order))
			System.out.println(order+" is available");
		else
			System.out.println(order+" is not available");
		driver.close();
	}}
