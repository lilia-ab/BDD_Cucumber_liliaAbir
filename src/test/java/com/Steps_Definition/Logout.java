package com.Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Driver_Factory.DriverFactory;
import com.pages.Account_Page;
import com.pages.Login_Page;
import com.pages.Logout_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
    
	  

    @Given("User navigate to logout page")
    public void user_navigates_to_logout_page(String emailText,String passwordText) {
        driver = DriverFactory.getDriver();
        Login_Page loginpage = new Login_Page(driver);
    	loginpage.enterEmail(emailText);
    	loginpage.enterPassword(passwordText);
    	Account_Page accountpage = new Account_Page(driver);
    	accountpage = loginpage.clickOnLoginButton();
    	
    }
    
    @When("User click on logout button")
    public void user_click_on_logout_button() {
    	Logout_Page logoutpage = new Logout_Page();
    	logoutpage.clickOnLogout();
        
    }
    @And("User click on continue button")
    public void User_click_on_continue_button() {
    	Logout_Page logoutpage = new Logout_Page();
    	logoutpage.clickOnContinueButton();
    }
    
    @Then("User is redirected to home page")
    public void user_is_redirected_to_home_page() {
    	Assert.assertTrue(driver.findElement(By.linkText("Software")).isDisplayed());
    	
    }
    


}
