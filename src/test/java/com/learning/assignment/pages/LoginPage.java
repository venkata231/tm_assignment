package com.learning.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.learning.assignment.utility.WebDriverUtility;

public class LoginPage extends BasePage {
	WebDriverUtility utility;

	/**
	 * Constructor that supplies the driver to super class
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Web Elements
	
	// Login Text
	@FindBy(xpath = "(//*[text()= 'Log In'])[2]")
	private WebElement _txtLogin;

	// Actions (Methods) on the web elements
	
	public String getLoginHeaderTxt() {
		utility.waitForElement(getDriver(), _txtLogin);
		return _txtLogin.getText();
	}

}
