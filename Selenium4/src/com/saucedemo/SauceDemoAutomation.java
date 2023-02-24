package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Day2.BaseClass;

public class SauceDemoAutomation extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement bagPack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		bagPack.click();
		Thread.sleep(2000);
		WebElement bikeLight = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        bikeLight.click();
        Thread.sleep(2000);
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartIcon.click();
        Thread.sleep(2000);
        WebElement viewCart = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        viewCart.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Sanjai");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Kanna");
        Thread.sleep(2000);
        WebElement pinCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        pinCode.sendKeys("600015");
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        Thread.sleep(2000);
        scrollByTopToBottomPixels2();
        Thread.sleep(2000);
        WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
        finishButton.click();
        scrollByBottomToTopPixels();
        
	}

}
