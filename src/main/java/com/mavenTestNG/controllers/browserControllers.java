package com.mavenTestNG.controllers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserControllers {
	
	WebDriver driver;
	
	// Method to open the browser
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D://Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}
	
	public void openWebsite() {
		driver.get("https://www.facebook.com/");
	}
	
	// Method to close the current browser
	public void closeBrowser() {
		driver.close();
	}
}
