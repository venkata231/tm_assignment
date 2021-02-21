package com.learning.assignment.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.learning.assignment.pages.ManageMoneyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ManageMoneyStepDefinition{
	ManageMoneyPage manageMoneyPage;
	WebDriver driver;
	BaseStepDefinition baseTest;
		
	public ManageMoneyStepDefinition(BaseStepDefinition baseTest) {
		this.baseTest = baseTest;
		driver = baseTest.getDriver();
	}

	@When("I click the Continue To Login button")
	public void i_click_the_continue_to_login_button() throws InterruptedException {
		manageMoneyPage = new ManageMoneyPage(driver);
		manageMoneyPage.clickOnContinueToLogin();
	}

	@Then("I see the “Manage your money” page")
	public void i_see_the_manage_your_money_page() {
		manageMoneyPage = new ManageMoneyPage(driver);
		System.out.println(" Header info " + manageMoneyPage.getManageMoneyLabelInfo());
		Assert.assertEquals("Manage your money with online banking", manageMoneyPage.getManageMoneyLabelInfo());
	}
	
}
