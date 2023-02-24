package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanjai");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kanna");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9865743210");
		driver.findElement(By.id("password_step_input")).sendKeys("cf21s12ke");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(18);
		
		WebElement month = driver.findElement(By.id("month"));
        Select s1 = new Select(month);
        s1.selectByVisibleText("May");
        
        WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
        Select s2 = new Select(year);
        s2.selectByValue("1995");
       // s1.deselectAll();
	}

}
