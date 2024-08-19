package com.Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.Driver_Factory.DriverFactory;
import com.Utilities.Config_Reader;
import com.Utilities.Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

	 public WebDriver driver;
	    

	    @Before
	    public void setup() throws Exception{
	    	System.out.println(driver);
	    	Properties prop = Config_Reader.initialisation();
	        DriverFactory.initializeBrowser(prop.getProperty("browser"));
	        driver = DriverFactory.getDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGE_LOAD_TIME));
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME));
	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));
	    }

	    @After
	    public void tearDown(){
	        driver.quit();
	    }


}
