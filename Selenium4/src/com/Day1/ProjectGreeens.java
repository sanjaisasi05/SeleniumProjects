package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public  class ProjectGreeens {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Strawberry"+Keys.ENTER);
        Thread.sleep(2000); 	
		WebElement buttonElement = driver.findElement(By.className("increment"));
		
		for(int i=0;i<9;i++) {
			Thread.sleep(2000);
			buttonElement.click();
		}
		driver.findElement(By.className("product-action")).click();
		Thread.sleep(2000);		
		WebElement Cart = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]"));
		Actions ac = new Actions(driver);
		ac.click(Cart).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select sc = new Select(country);
		sc.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}

}
