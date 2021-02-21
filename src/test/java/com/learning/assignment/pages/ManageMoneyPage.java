package com.learning.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.learning.assignment.utility.WebDriverUtility;

public class ManageMoneyPage extends BasePage {
	WebDriverUtility utility;

	public ManageMoneyPage(WebDriver driver) {
		super(driver);
	}
	
	// Web Elements

	// login button
	@FindBy(xpath = "(//button[contains(@class, 'Button__Wrapper-oxr3np-0') and contains(text(),'continue to login')])[1]")
	private WebElement _btnContinueToLogin;

	// Manage your money with online banking
	@FindBy(xpath = "(//*[contains(@class, 'Typography__H1-q8nsdf-0')])[1]")
	private WebElement _txtManageYourMoney;

	// Actions (Methods) on the web elements
	
	public String getManageMoneyLabelInfo() {
		utility.waitForElement(getDriver(),_txtManageYourMoney);
		return _txtManageYourMoney.getText();
	}
	
	public void clickOnContinueToLogin() {
		utility.waitForElement(getDriver(),_btnContinueToLogin);
		_btnContinueToLogin.click();
	}

}
