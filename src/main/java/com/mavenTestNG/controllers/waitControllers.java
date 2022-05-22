package com.mavenTestNG.controllers;

public class waitControllers {
	
	public void waitForSeconds(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
}
