package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		
		String attribute = drag.getAttribute("class");
		System.out.println(attribute);
		
		boolean enabled = drop.isEnabled();
		System.out.println(enabled);
		
		boolean selected = drag.isSelected();
		System.out.println(selected);
		
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();

	}

}
