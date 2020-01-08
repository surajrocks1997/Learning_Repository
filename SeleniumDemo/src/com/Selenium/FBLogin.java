package com.Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Productivity\\Downloads\\Programs\\Selenium Chrome Driver Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		
		driver.manage().window().maximize();	//maximizes the browser
		String baseUrl = "https://www.seedr.cc/";
		
		driver.get(baseUrl);	//opens site
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		driver.findElement(By.name("username")).sendKeys("surajrocks1997@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])[3]")).sendKeys("mynameissurajgupta");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='menu-drop']/i")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logout-menu-item")))).click();
		
		
		System.out.println("Successfully Logged in and Logged out...");
		
		

	}

}

