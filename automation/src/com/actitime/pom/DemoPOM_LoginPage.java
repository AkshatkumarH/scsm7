package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPOM_LoginPage {
@FindBy(id="username")
private WebElement untbx;         //declaration
@FindBy(id="pwd")
private WebElement pwtbx;
@FindBy(xpath="//div[.='Login ']")
private WebElement lgBtn;

public DemoPOM_LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);    //initialisation
}
public void setLogin(String un, String pw) { 
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);               //utilisation
	lgBtn.click();
}
}
