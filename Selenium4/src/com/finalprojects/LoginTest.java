package com.finalprojects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.Day2.BaseClass;

public class LoginTest extends BaseClass {


	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, GreensCartLogin.class);
		
		GreensCartLogin.searchBar.sendKeys("brocolli");
		GreensCartLogin.addToCart.click();
		GreensCartLogin.cartIcon.click();
		GreensCartLogin.proceedToCheck.click();
		
		PageFactory.initElements(driver, NextPage.class);
		NextPage.enterPromoValue.sendKeys("Sanjai");
		NextPage.applyButton.click();
		NextPage.placeButton.click();
		
		PageFactory.initElements(driver, LastPage.class);
		LastPage.countryData.sendKeys("India");
		LastPage.countryData.click();
		LastPage.checkBox.click();
		LastPage.proceedButton.click();

	}
}
