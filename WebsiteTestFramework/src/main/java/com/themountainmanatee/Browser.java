package com.themountainmanatee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Browser {

	public static WebDriver driver ;
	
	public static void goTo(String url) {
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static String getTitle() {

		return driver.getTitle();
	}

	public static String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static WebElement getElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void close() {
		driver.close();
		
	}

	public static void setImplicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public static void selectAndClick(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void selectAndType(String xpath, String input) {
		driver.findElement(By.xpath(xpath)).sendKeys(input);
	}
	
	public static boolean verifyElementExistence(String xpath){
		Dimension element = driver.findElement(By.xpath(xpath)).getSize();
		if ( (int) element == 0) {
			return false;
		} else {
			return true;
		}

	}
}



