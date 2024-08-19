package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page {
public WebDriver driver;
	



@FindBy(linkText = "Logout")
private WebElement logoutLink;


public Account_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public boolean validateDisplayStatusOfLogoutLink() {
	boolean displayStatus = logoutLink.isDisplayed();
	return displayStatus;
}
}
