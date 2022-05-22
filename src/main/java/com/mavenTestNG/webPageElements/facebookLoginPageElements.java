package com.mavenTestNG.webPageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPageElements {

	WebDriver driver;
	
	public facebookLoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") public WebElement userName;
	@FindBy(id="pass") public WebElement password;
	@FindBy(xpath="//button[@type='submit']") public WebElement logInButton;
}
