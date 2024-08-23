package com.Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.Driver_Factory.DriverFactory;
import com.pages.Account_Page;
import com.pages.Home_Page;
import com.pages.Login_Page;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
    
	  

    @Given("User navigates to loginpage")
    public void user_navigates_to_login_page() {
    	driver = DriverFactory.getDriver();
        Home_Page homepage = new Home_Page(driver);
        homepage.clickOnMyAccount();
        homepage.clickOnLogin();
        
    }

    @When("^User enters valid user email(.+)$")
    public void user_enters_valid_email(String email) {
    	Login_Page loginpage = new Login_Page(driver);
    	loginpage.enterEmail(email);
        
    }

    @And("^User enters valid pass password(.+)$")
    public void user_enters_valid_password(String password) {
    	Login_Page loginpage = new Login_Page(driver);
    	loginpage.enterPassword(password);
        
    }
    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
    	Login_Page loginpage = new Login_Page(driver);
    	Account_Page accountpage = new Account_Page(driver);
    	accountpage = loginpage.clickOnLoginButton();
        
    }

    @Then("User is redirected to Account Page")
    public void user_is_redirected_to_account_page() {
    	Account_Page accountpage = new Account_Page(driver);
    	Assert.assertTrue(accountpage.validateDisplayStatusOfLogoutLink());
        
    }

}
