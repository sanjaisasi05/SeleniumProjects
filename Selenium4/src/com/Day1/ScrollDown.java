package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Day2.BaseClass;

public class ScrollDown  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[3]/span[1]/div/a/div"));
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",logo );
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(2000);
//		WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		js.executeScript("arguments[0].click();",signIn);
//		
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
	}

}
