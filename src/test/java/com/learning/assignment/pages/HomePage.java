package com.learning.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	/**
	 * Constructor that supplies the driver to super class
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
	// Web Elements
	
	@FindBy(xpath = "(//a/button[text()='Log in'])[2]")
	private WebElement _btnLogin;

	// Actions (Methods) on the web elements
	
	public String getTitle() {
		return getDriver().getTitle();
	}

	public ManageMoneyPage clickOnLoginButton() {
		_btnLogin.click();
		return new ManageMoneyPage(getDriver());
	}

}
