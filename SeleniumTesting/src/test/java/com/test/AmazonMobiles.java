package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class AmazonMobiles {
	 
	
	public static void main(String args[])   {
		// System.setProperty("javax.net.debug", "null");
		System.setProperty("webdriver.chrome.driver", "/Users/KarkalaSumeeth/Documents/chromedriver.exe");
		 // Initialize WebDriver
		 // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Utility and locators setup
            Locators locators = new Locators(driver);
        

            // Navigate to the Amazon website
            driver.get("https://www.amazon.in/");

            // Perform operations
            locators.clickOnAllSideBarBtn();
            driver.manage().window().maximize();
            System.out.println("Sidebar button clicked successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cleanup: Close the browser session
            driver.quit();
        }
    }
}