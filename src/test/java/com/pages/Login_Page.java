package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	
	public WebDriver driver;
	@FindBy(id = "input-email")
	private WebElement emailTextbox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextbox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
	private WebElement warningMessage;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emailText) {
		emailTextbox.sendKeys(emailText);
	}
	
	public void enterPassword(String passwordText) {
		passwordTextbox.sendKeys(passwordText);
	}
	
	public Account_Page clickOnLoginButton() {
		loginButton.click();
		return new Account_Page(driver);
	
	}
	
	public String retrieveWarningMessageText() {
		String wMessage = warningMessage.getText();
		return wMessage;
	}}

