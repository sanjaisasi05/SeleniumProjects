package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("I am Sanjai");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(firstFrame);
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]")));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("This is my World");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
		

	}

}
