package com.learning.assignment.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStepDefinition {
	WebDriver driver;
	public static boolean startBrowser = false;

	/**
	 * Before method to initialise the driver and to check if the driver is already created
	 */
	@Before
	public void init() {
		if (!startBrowser) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/lib/chromedriver");
			driver = new ChromeDriver();
			startBrowser=false;
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * After method to tear down the created driver 
	 */
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
