package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAuthenticationPopUp {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}}
