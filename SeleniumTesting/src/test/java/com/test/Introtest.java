package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Introtest {

	

	

	public static void main(String[] args) {
		
		
    //Invoking browser
	//chrome -chromedriver extends-->method class get
	//firefox -firefoxdriver extends-->method class get
	//safari  -saariDrier   extends-->method class get
    //WebDriver class get --->WebDriver methods + class methods	
//---------------chrome driver
//		System.setProperty("webdriver.chrome.driver", "/Users/KarkalaSumeeth/Documents/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.close();
		
//------------------firefox driver	
//		System.setProperty("webdriver.gecko.driver", "/Users/KarkalaSumeeth/Downloads/geckodriveru");	
        WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.google.com");
		driver1.quit();
	


//-------Edge driver
	
	System.setProperty("webdriver.gecko.driver", "/Users/KarkalaSumeeth/Downloads/geckodriveru");	
    WebDriver driver2= new EdgeDriver();
	driver2.get("https://www.amazon.in/");
	driver2.quit();
	
	
	
	}
}
