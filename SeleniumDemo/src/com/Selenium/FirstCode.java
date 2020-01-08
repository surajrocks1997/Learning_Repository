package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Productivity\\Downloads\\Programs\\Selenium Chrome Driver Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	//maximizes the browser
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = driver.getTitle();
		String actualTitle = "";
		
		driver.get(baseUrl);	//opens the baseUrl in browser
		
		
		
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
