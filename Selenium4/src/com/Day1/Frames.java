package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
		button.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");	
		WebElement button2 = driver.findElement(By.xpath("//button[contains(@style,'background: linear-gradient')][3]"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		totalframes.size();
		System.out.println("size");
		
		
		
		

	}

}
