package com.learning.assignment.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.learning.assignment.pages.HomePage;
import com.learning.assignment.pages.ManageMoneyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomeStepDefinition {
	WebDriver driver;
	String url = "http://www.thinkmoney.co.uk";
	HomePage homePage;
	BaseStepDefinition baseTest;
	ManageMoneyPage manageMoneyPage;
	LoginStepDefinition loginSteps;

	/**
	 * Constructor that loads the driver instance and set the driver 
	 * @param baseTest
	 */
	public HomeStepDefinition(BaseStepDefinition baseTest) {
		this.baseTest = baseTest;
		this.driver = baseTest.getDriver();
	}

	@Given("As a Customer")
	public void as_a_customer() {
		System.out.println(" Driver ------- "+ baseTest.getDriver());
		homePage = new HomePage(driver);
	}

	@When("I visit the thinkmoney website www.thinkmoney.co.uk")
	public void i_visit_the_thinkmoney_website_www_thinkmoney_co_uk() {
		driver.get(url);
	}

	@Then("I see the thinkmoney homepage")
	public void i_see_the_thinkmoney_homepage() {
		System.out.println(" Home Page Title " + homePage.getTitle());
		Assert.assertEquals("thinkmoney | Digital banking for everyone | thinkmoney", homePage.getTitle());
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		manageMoneyPage = homePage.clickOnLoginButton();
	}
}
