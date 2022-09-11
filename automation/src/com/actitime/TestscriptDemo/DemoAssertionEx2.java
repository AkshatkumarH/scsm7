package com.actitime.TestscriptDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class DemoAssertionEx2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle="Google";
		String aTitle=driver.getTitle();

		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();
	}}
