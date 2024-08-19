package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page {
	
	public WebDriver driver;
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	
	@FindBy(css = "a.btn.btn-primary")
	private WebElement continuebutton;
	
	public void clickOnLogout() {
		logoutlink.click();
	}
	
	public void clickOnContinueButton() {
		continuebutton.click();
	}
	

}
