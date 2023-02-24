package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.facebook.com");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Sanjai05@gmailcom");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Sanjai1234");
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.name("login"));
		logIn.click();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

}
