package com.mavenTestNG.tests;

import org.mavenTestNG.webPages.facebookLoginPage;
import org.testng.annotations.Test;

public class loginWorkflow extends EnvironmentSetUp{
	
	facebookLoginPage fblp;
	
  @Test
  public void loginIntoFacebook(){
	  
	  fblp = new facebookLoginPage(driver);
	  fblp.enterPassword("xyz@gmail.com");
	  fblp.enterPassword("abcd1234");
	  fblp.clickOnLoginButton();
  }
  
  @Test
  public void loginIntoFacebook1(){
	  
	  fblp = new facebookLoginPage(driver);
	  fblp.enterPassword("xyz@gmail.com");
	  fblp.enterPassword("abcd1234");
	  fblp.clickOnLoginButton();
  }
}
