package com.actitime.TestscriptDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertionEx1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle="Soogle";
		String actualTitle=driver.getTitle();

		if(actualTitle.contains(expectedTitle)) {
			Reporter.log("Title is matching so PASS",true);
		}
		else {
			Reporter.log("Title is not matching so FAIl",true);
		}
		driver.close();
	}
}
