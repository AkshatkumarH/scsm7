package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.DemoPOM_LoginPage;

public class DemoPOM_MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		DemoPOM_LoginPage l=new DemoPOM_LoginPage(driver);
		l.setLogin("admin","manager");
	}}