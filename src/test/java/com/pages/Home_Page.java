package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Home_Page {
public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountButton;
	
	@FindBy(linkText = "Login")
	private WebElement loginButton;
	
	@FindBy(linkText = "Register")
	private WebElement registerButton;
	
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccount() {
		myAccountButton.click();
	}

	public Login_Page clickOnLogin() {
		loginButton.click();
		return new Login_Page(driver);
	}
	
	public void clickOnRegister() {
		registerButton.click();
		
	}
}
