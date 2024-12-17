package com.test1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebPage {

    // Method to wait until the page is completely loaded
    public static void waitForPageLoad(WebDriver driver) {
        // Create an instance of WebDriverWait with a 30-second timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Use an ExpectedCondition that checks for the document's readyState to be 'complete'
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                String readyState = js.executeScript("return document.readyState").toString();
                return readyState.equals("complete");  // Return true when the page is fully loaded
            }
        });
    }
}

