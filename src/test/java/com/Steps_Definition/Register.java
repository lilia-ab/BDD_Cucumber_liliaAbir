package com.Steps_Definition;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Driver_Factory.DriverFactory;
import com.Utilities.Util;
import com.pages.Home_Page;
import com.pages.Register_Page;
import com.pages.SuccefullyCreated_Page;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	public WebDriver driver;
	
	 @Given("User navigates to Register page")
	    public void user_navigates_to_register_page() {
	        driver = DriverFactory.getDriver();
	        Home_Page homepage = new Home_Page(driver);
	        homepage.clickOnMyAccount();
	        homepage.clickOnRegister();;
	        
	    }
	 @When("User enters below all fields")
	    public void user_enters_below_all_fields(io.cucumber.datatable.DataTable dataTable) {
	        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
	        Register_Page registerpage = new Register_Page(driver);
	        registerpage.enterFirstName(dataMap.get("firstname"));
	        registerpage.enterLastName(dataMap.get("lastname"));
	        registerpage.enterEmail(Util.DateTimeStampEmails());
	        registerpage.enterTelephone(dataMap.get("telephone"));
	        registerpage.enterPassword(dataMap.get("password"));
	        registerpage.enterConfirmPassword(dataMap.get("confirmpassword"));
	        
	        
	    }
	 @And("User selects Yes for Newsletter")
	    public void user_selects_yes_for_newsletter(){
	    	Register_Page registerpage = new Register_Page(driver);
	    	registerpage.selectNewsLetterButton();
	        
	    }
	    @When("User selects Privacy Policy checkbox")
	    public void user_selects_privacy_policy_checkbox() {
	    	Register_Page registerpage = new Register_Page(driver);
	    	registerpage.selectPrivacyPolicyCheckBox();
	        

	    }
	    @And("User clicks on Continue button")
	    public void user_clicks_on_continue_button() {
	    	Register_Page registerpage = new Register_Page(driver);
	    	registerpage.clickContinueButton();
	        
	    }
	    @Then("User account gets created successfully")
	    public void user_account_gets_created_successfully() {
	    	SuccefullyCreated_Page accountsuccesspage = new SuccefullyCreated_Page(driver);
	    	Assert.assertTrue(accountsuccesspage.validateAccountSuccessCreatedMessage());
	        

	    }



}
