package com.demoblaze;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.Day2.BaseClass;

public class AutomateDemoBlaze extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, DemoBlaze.class);
		
		scrollByTopToBottomPixels();
		DemoBlaze.monitotsPress.click();
		DemoBlaze.pressApple.click();
		backward();
		DemoBlaze.pressAsus.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, NxtPgeDemoBlaze.class);
		NxtPgeDemoBlaze.cartAsus.click();
		Thread.sleep(8000);
		simpleAlert();
        navigateTo("https://www.demoblaze.com/prod.html?idp_=10");
        Thread.sleep(8000);
		NxtPgeDemoBlaze.cartApple.click();
		Thread.sleep(8000);
        simpleAlert();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, CartPage.class);
		CartPage.cartIcon.click();
		scrollByTopToBottomPixels();
		CartPage.placeOrder.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, placeOrderPage.class);
		placeOrderPage.userName.sendKeys("SanjaiKanna Velu");
		placeOrderPage.countryName.sendKeys("India");
		placeOrderPage.cityName.sendKeys("Chennai");
		placeOrderPage.creditCard.sendKeys("5610591081018250");
		placeOrderPage.cardMonth.sendKeys("12");
		placeOrderPage.cardYear.sendKeys("2030");
		placeOrderPage.purchaseButton.click();
		Thread.sleep(12000);
		placeOrderPage.okButton.click();
	}

}
