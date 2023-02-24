package com.demoqaspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Day2.BaseClass;

public class DemoQa extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://shop.demoqa.com/");
		
		scrollByTopToBottomPixels2();
		Thread.sleep(7000);
		WebElement redSatin = driver.findElement(By.xpath("//a[text()='red satin round neck backless maxi dress']"));
		redSatin.click();
		Thread.sleep(7000);
		scrollByTopToBottomPixels1();
		Thread.sleep(7000);
		WebElement chooseColor = driver.findElement(By.xpath("//select[@id='pa_color']"));
		dropDown(chooseColor, "byValue", "red");
		Thread.sleep(7000);
		WebElement chooseSize = driver.findElement(By.xpath("//select[@id='pa_size']"));
		dropDown(chooseSize, "byVisibleText", "Medium");
		Thread.sleep(4000);
		WebElement quantityButton = driver.findElement(By.xpath("//button[@class='qty-increase']"));
		quantityButton.click();
		Thread.sleep(3000);
		WebElement addToCart = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		addToCart.click();
		Thread.sleep(2000);
		WebElement viewCart = driver.findElement(By.xpath("//a[@class='button wc-forward wp-element-button']"));
		viewCart.click();
		Thread.sleep(2000);
		scrollByTopToBottomPixels1();
		Thread.sleep(2000);
		WebElement proceedToCheckout = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward wp-element-button']"));
		proceedToCheckout.click();
		scrollByTopToBottomPixels2();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		firstName.sendKeys("Rohith");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		lastName.sendKeys("Surya");
		Thread.sleep(2000);
		WebElement companyName = driver.findElement(By.xpath("//input[@id='billing_company']"));
		companyName.sendKeys("VSR CLOTHING");
		Thread.sleep(2000);
		WebElement houseNo = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		houseNo.sendKeys("No.67 DubaiMainRoad");
		Thread.sleep(2000);
		WebElement apartmentType = driver.findElement(By.xpath("//input[@id='billing_address_2']"));
		apartmentType.sendKeys("Grand Dubai");
		Thread.sleep(2000);
		scrollByTopToBottomPixels2();
		Thread.sleep(2000);
		WebElement cityName = driver.findElement(By.xpath("//input[@id='billing_city']"));
		cityName.sendKeys("Chennai");
		Thread.sleep(2000);
        WebElement postCode = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
        postCode.sendKeys("600015");
        Thread.sleep(2000);
        WebElement phNo = driver.findElement(By.xpath("//input[@id='billing_phone']"));
        phNo.sendKeys("8608680160");
        Thread.sleep(2000);
        WebElement emailAdd = driver.findElement(By.xpath("//input[@id='billing_email']"));
		emailAdd.sendKeys("rohithsurya07@gmail.com");
		Thread.sleep(2000);
		scrollByBottomToTopPixels();
		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		checkBox.click();
		Thread.sleep(2000);
		WebElement placeOrder = driver.findElement(By.xpath("//button[@id='place_order']"));
		placeOrder.click();
		Thread.sleep(3000);
		scrollByTopToBottomPixels1();
	}

}
