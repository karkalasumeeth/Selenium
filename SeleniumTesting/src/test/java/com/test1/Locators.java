package com.test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.test1.Utility;
import com.test1.WebPage;

public class Locators {
	WebDriver driver;
	// WaitUtils waitUtils = new WaitUtils(driver);
	Utility pageLoad = new Utility(driver);

	public Locators(WebDriver driver) {
		this.driver = driver;
	}

	// Finding object for All sidebar in amazon
	@FindBy(css = "a[id='nav-hamburger-menu']")
	private WebElement allSideBar;

	// Finding object for sidebar assert
	@FindBy(xpath = "//div[contains(text(),'Trending')]")
	private WebElement allSideBarAssert;
	
	//Finding object for 
	@FindBy(xpath="(//div[@id='hmenu-content']//a[text()='Best Sellers'])[1]")
	private WebElement bestSellerLink;
	// Methods

	// Method to click on the All Sidebar Button with an explicit wait
	public void clickOnAllSideBarBtn() {
		// WebPage.waitForPageLoad(driver);
		// Use WebDriverWait to wait until the element is clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until the element with the ID 'nav-hamburger-menu' is clickable
		WebElement sidebarBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-hamburger-menu")));
		// WebElement sidebarBtn =
		// wait.until(ExpectedConditions.elementToBeClickable(allSideBar));
		// Once it's clickable, perform the click
		// waitForPageLoad(driver, allSideBar);
		sidebarBtn.click();
//allSideBar.click();
		System.out.println("sidebard button is clicked");
		// Thread.sleep(2000);
//		WebElement allSideBarAssertele = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Trending')]")));
		// WebElement allSideBarAssertele =
		// wait.until(ExpectedConditions.visibilityOf(allSideBarAssert));
	//	pageLoad.waitForPageLoad();
//		waitUtils.waitForClickability(allSideBarAssert, 2);
//        waitUtils.waitForVisibility(allSideBarAssert, 2);
//		if (allSideBarAssertele.isDisplayed()) {
//			Assert.assertEquals(allSideBarAssertele.getText(), "Trending", "Sidebar header is not displayed");
//			System.out.println("AllSideBar is visible on the page!");
//		} else {
//			System.out.println("AllSideBar is not visible on the page.");
//		}
		// Assert.assertEquals(allSideBarAssert.getText(), "Hello, sign in", "Sidebar
		// header is not displayed");
		// System.out.println(allSideBarAssertele.getText());
	}

}
