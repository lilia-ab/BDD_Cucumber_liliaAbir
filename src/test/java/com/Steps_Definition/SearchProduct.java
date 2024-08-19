package com.Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Driver_Factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
public WebDriver driver;

@Given("User opens the application")
public void user_opens_the_application() {
    driver = DriverFactory.getDriver();
}

@When("User enters valid product {string}")
public void enterValidProduct(String validProductText) {
    driver.findElement(By.name("search")).sendKeys(validProductText);
}
@And("User clicks on search button")
public void clickOnSearchButton() {
    driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();

}
@Then("User gets valid product info display in search page")
public void validProducDisplayInformation() {
    Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());

}
}
