package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Productivity\\Downloads\\Programs\\Selenium Chrome Driver Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseUrl);
		WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("tutorial");
		

	}

}
