//****vvv imp****
//WAST TAKE THE SCREENSHOT OF THE WEBPAGE ???

package com.actitime.TestscriptDemo;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testScreenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
		//to press the printScreen button
		File src=t.getScreenshotAs(OutputType.FILE);
		//to create a file in the below location
		File dest=new File("./ScreenShot/ss.png");
		//to move the screenshot from src to dest
		FileUtils.copyFile(src, dest);
	}}