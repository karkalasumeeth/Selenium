package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/KarkalaSumeeth/Documents/chromedriver.exe");
		 // Initialize WebDriver
		 // Initialize WebDriver
       WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl().equals("https://www.flipkart.com/"));
	//	driver.findElement(By.xpath("//span[@role='button']"));
		driver.findElement(By.xpath("//span[contains(text(),'Grocery')]")).click();
		System.out.println(driver.getTitle().contains("Flipkart Grocery Store"));
		
		driver.close();
	}

}
