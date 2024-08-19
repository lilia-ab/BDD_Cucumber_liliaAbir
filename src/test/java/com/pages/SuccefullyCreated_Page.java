package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccefullyCreated_Page {
	
	public WebDriver driver;
	
	@FindBy(css = "div#content>p:nth-child(2)")
	private WebElement message;
	
	public SuccefullyCreated_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccountSuccessCreatedMessage() {
		boolean displayStatus = message.isDisplayed();
		return displayStatus;
	}
}
