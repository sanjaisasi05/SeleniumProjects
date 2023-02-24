package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
	//	WebElement simpleAlert = driver.findElement(By.xpath("//*[@id=\'alertBox\']"));
	//	simpleAlert.click();
	//	Thread.sleep(3000);
		
		WebElement confirmAlert = driver.findElement(By.xpath("//*[@id=\'confirmBox\']"));
		confirmAlert.click();
		
	//	Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		WebElement promptAlert = driver.findElement(By.xpath("//*[@id=\'promptBox\']"));
		promptAlert.click();
		
//		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("SanjaiKanna");
		
//		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
	}

}
