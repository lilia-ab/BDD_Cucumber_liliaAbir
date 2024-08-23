package com.Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Driver_Factory.DriverFactory;
import com.pages.Account_Page;
import com.pages.Home_Page;
import com.pages.Login_Page;
import com.pages.Logout_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
    
	  

    @Given("User navigate to login")
    public void user_navigate_to_the_login_page() {
    	
    	driver = DriverFactory.getDriver();
        Home_Page homepage = new Home_Page(driver);
        homepage.clickOnMyAccount();
        Login_Page loginpage = new Login_Page(driver);
        loginpage = homepage.clickOnLogin();
    	
    	
    	
    	
    }
    
    @When("^User enters valid user name email(.+)$")
    public void user_click_on_logout_button(String email) {
    	Login_Page loginpage = new Login_Page(driver);
    	loginpage.enterEmail(email);
        
    }
    @And("^User enters valid password(.+)$")
    public void user_click_on_continue_button(String password) {
    	Login_Page loginpage = new Login_Page(driver);
    	loginpage.enterPassword(password);
    }
    
    @And("User clicks on login")
    public void user_clicks_on_login_button() {
    	Login_Page loginpage = new Login_Page(driver);
    	Account_Page accountpage = new Account_Page(driver);
    	accountpage = loginpage.clickOnLoginButton();
    }
    @And("User clicks on Logout link")
    public void user_clicks_on_Logout_link(){
    	Logout_Page logout = new Logout_Page(driver);
    	logout.clickOnLogout();
    	
    }
    @Then("User is redirected to home page")
    public void user_is_redirected_to_home_page() {
    	Logout_Page logout = new Logout_Page(driver);
    	logout.clickOnContinueButton();
    }
    


}
