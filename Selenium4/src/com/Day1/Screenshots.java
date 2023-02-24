package com.Day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("secret_sauce");
		
		WebElement logIn = driver.findElement(By.xpath("//input[@type='submit']"));
		logIn.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File desttination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Snaps\\saucedemo1.png");
		Files.copy(screenshotAs, desttination);
		
	
	}

}
