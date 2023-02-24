package com.Day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Day2.BaseClass;

public class AmazonAutomation extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		browserLaunch("cHrome");
		getUrl("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22 ultra"+Keys.ENTER);
		screenShot("url");
		WebElement samsung = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		Actions ac = new Actions(driver);
		ac.click(samsung).perform();
		
		WebElement samSung = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		js.executeScript("arguments[0].scrollIntoView();",samSung);
		
		WebElement signIn = driver.findElement(By.className("a-button-input"));
		js.executeScript("arguments[0].click();",signIn);

		
		
		
		

	}

}
