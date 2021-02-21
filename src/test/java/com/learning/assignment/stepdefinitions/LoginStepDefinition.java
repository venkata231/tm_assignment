package com.learning.assignment.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.learning.assignment.pages.LoginPage;
import com.learning.assignment.pages.ManageMoneyPage;
import com.learning.assignment.utility.WebDriverUtility;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	BaseStepDefinition baseTest;
	LoginPage loginPage;
	WebDriverUtility utility;

	public LoginStepDefinition(BaseStepDefinition baseTest) {
		this.baseTest = baseTest;
		driver = baseTest.getDriver();
	}

	@Then("I see the Login page")
	public void i_see_the_login_page() {
		utility = new WebDriverUtility(driver);
		utility.switchToWindow();
		loginPage = new LoginPage(driver);
		System.out.println(" Login Page Header Info "+ loginPage.getLoginHeaderTxt());
		Assert.assertEquals("Log In", loginPage.getLoginHeaderTxt());
	}

}
