package com.mavenTestNG.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mavenTestNG.controllers.browserControllers;

public class EnvironmentSetUp {
	
	browserControllers brwCon;
	WebDriver driver;
  
  @BeforeMethod(alwaysRun=true)
  public void setUp() {
	  brwCon = new browserControllers();
	  driver = brwCon.openBrowser();
	  brwCon.openWebsite();	  
  }
  
  @AfterMethod(alwaysRun=true)
  public void tearDown() {
	  brwCon.closeBrowser();
  }
}
