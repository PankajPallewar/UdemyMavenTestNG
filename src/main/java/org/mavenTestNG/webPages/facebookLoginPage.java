package org.mavenTestNG.webPages;

import org.openqa.selenium.WebDriver;

import com.mavenTestNG.webPageElements.facebookLoginPageElements;

public class facebookLoginPage {
	
	WebDriver driver;
	facebookLoginPageElements loginPageEle;
	
	public facebookLoginPage(WebDriver driver) {
		this.driver = driver;
		loginPageEle = new facebookLoginPageElements(driver);
	}
	
	public void enterUsername(String userName) {
		loginPageEle.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		loginPageEle.password.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginPageEle.logInButton.click();
	}

}
