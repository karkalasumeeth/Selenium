package com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import net.sourceforge.tess4j.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ExtractTextFromImage {
	public static void main(String[] args) {
		// Path to chromedriver
	//	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Navigate to the webpage with the image
			driver.get("https://www.amazon.in/");

			// Locate the image element
			WebElement imageElement = driver.findElement(By.xpath("//img[contains(@src,'Captcha')]"));

			// Take a full-page screenshot
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullImg = ImageIO.read(screenshot);
			System.out.println(fullImg);
			File FullImageScreenshot = new File("C:/Users/KarkalaSumeeth/Documents/Demo/com.test/ExtractTextFromImage/fullimage_image.png");
			ImageIO.write(fullImg, "png", FullImageScreenshot);

			// Get the dimensions and location of the image element
			Point imageLocation = imageElement.getLocation();
			int imageWidth1 = imageElement.getSize().getWidth();
			int imageHeight1 = imageElement.getSize().getHeight();

			// Crop the screenshot to the image element's dimensions
			BufferedImage croppedImage1 = fullImg.getSubimage(imageLocation.getX()+5, imageLocation.getY()+ 60, imageWidth1=400,
					imageHeight1=95);
			// Save the cropped image to a file
						File croppedFile1 = new File("C:/Users/KarkalaSumeeth/Documents/Demo/com.test/ExtractTextFromImage/cropped_image1.png");
						ImageIO.write(croppedImage1, "png", croppedFile1);
			
			// Custom cropping position and dimensions
			int customX = imageLocation.getX() + 5; // Shift X-coordinate by 10 pixels
			int customY = imageLocation.getY() + 60; // Shift Y-coordinate by 20 pixels
			int imageWidth = 400; // Custom width
			int imageHeight = 95; // Custom height

			// Log the custom crop parameters
			System.out.println("Crop Parameters - X: " + customX + ", Y: " + customY +
			                   ", Width: " + imageWidth + ", Height: " + imageHeight);

			// Crop the image with custom parameters
			BufferedImage croppedImage = fullImg.getSubimage(customX, customY, imageWidth, imageHeight);


			// Save the cropped image to a file
			File croppedFile = new File("C:/Users/KarkalaSumeeth/Documents/Demo/com.test/ExtractTextFromImage/cropped_image.png");
			ImageIO.write(croppedImage, "png", croppedFile);

			// Use Tess4J to perform OCR on the cropped image
			Tesseract tesseract = new Tesseract();
			tesseract.setDatapath("C:/Users/KarkalaSumeeth/Documents/Demo/com.test/ExtractTextFromImage"); // Path to tessdata directory
			tesseract.setLanguage("eng"); // Set language to English

			String extractedText = tesseract.doOCR(croppedFile);
			System.out.println("Extracted Text: " + extractedText);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Quit the browser
			driver.quit();
		}
	}
}
