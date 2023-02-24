package com.Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(prime);
		
		ac.contextClick().perform();
		
		
		
	}

}
