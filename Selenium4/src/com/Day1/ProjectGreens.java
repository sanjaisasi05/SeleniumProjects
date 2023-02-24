package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectGreens {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("search-keyword")).sendKeys("Musk Melon"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.className("quantity")).clear();
		Thread.sleep(3000);
		driver.findElement(By.className("quantity")).sendKeys("5");
		driver.findElement(By.className("product-action")).click();
		Thread.sleep(3000);
		WebElement Cart = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img"));
		Actions ac = new Actions(driver);
		ac.click(Cart).perform();
		
		driver.findElement(By.className("action-block")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select s = new Select(country);
		Thread.sleep(3000);
		s.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
	
		
		
		

	}

}
