package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.out.println("hi");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		}}