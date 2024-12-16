package com.test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

//    public static class WaitUtils { // Changed to static class for better accessibility
//        private WebDriver driver;
//
//        public WaitUtils(WebDriver driver) {
//            this.driver = driver;
//        }
//
//        // Method to wait for an element to be visible with a specified timeout
//        public WebElement waitForVisibility(WebElement allSideBarAssert, int timeoutInSeconds) {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//            return wait.until(ExpectedConditions.visibilityOfElementLocated((By) allSideBarAssert));
//        }
//
//        // Method to wait for an element to be clickable with a specified timeout
//        public WebElement waitForClickability(WebElement allSideBarAssert, int timeoutInSeconds) {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//            return wait.until(ExpectedConditions.elementToBeClickable(allSideBarAssert));
//        }
//    }

	private WebDriver driver;

	public Utility(WebDriver driver) {
		this.driver = driver;
	}

	// Method to wait for the page to load completely
	public void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Default timeout of 30 seconds

		// Wait for the document to reach readyState "complete"
		wait.until(driver -> {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("return document.readyState").equals("complete");
		});
	}
}
