package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFramess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hi! I AM SANJAI");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[1]")));
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hi! NarendraModi");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[3]")));
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Hi Vijai bro");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[2]")));
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hi Selvam Bro");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[2]/div/div")));
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
	//	driver.findElement(By.xpath("//input[@class='Hvn9fb zHQkBf']")).sendKeys("THE GAME IS OVER");
		
		
		
		
		

	}
}
