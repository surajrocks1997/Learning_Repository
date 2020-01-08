package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingbetweenPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Productivity\\Downloads\\Programs\\Selenium Chrome Driver Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	//maximizes the browser
		
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		
	}

}
