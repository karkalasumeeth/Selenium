package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;


public class driverstesting {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	//	System.setProperty("java.net.debug", "all");
		//System.setProperty("webdriver.chrome.driver", "/Users/KarkalaSumeeth/Documents/chromedriver.exe");
		// Initialize the ChromeDriver with the ChromeOptions
		WebDriver driver = new ChromeDriver();
		// Get the current ChromeDriver version by accessing the capabilities
		String chromeDriverVersion = ((ChromiumDriver) driver).getCapabilities().getBrowserVersion();

		// Print the ChromeDriver version
		System.out.println("Current ChromeDriver version: " + chromeDriverVersion);
		driver.get("https://www.amazon.in/");
		// Close the browser
		driver.quit();
	}
}