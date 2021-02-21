package com.learning.assignment.utility;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.learning.assignment.stepdefinitions.BaseStepDefinition;

public class WebDriverUtility {
	BaseStepDefinition baseTest;
	WebDriver driver;
	static int timeOut=20;
	static WebDriverWait wait;

	public WebDriverUtility(WebDriver driver) {
		this.driver= driver;
	}
	
	/**
	 * Method to wait for the element visibility 
	 * @param driver
	 * @param element
	 */
	public static void waitForElement(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Switch to newly opened window to perform actions
	 */
	public void switchToWindow() {
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = windows.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}

		}
	}
}

