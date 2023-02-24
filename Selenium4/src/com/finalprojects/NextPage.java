package com.finalprojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage {
	
	@FindBy(xpath="/html/body/div/div/div/div/div/div/input")
	public static WebElement enterPromoValue;
	
	@FindBy(xpath="//button[text()='Apply']")
	public static WebElement applyButton;
	
	@FindBy(xpath="//button[text()='Place Order']")
	public static WebElement placeButton;

	public static WebElement getEnterPromoValue() {
		return enterPromoValue;
	}

	public static WebElement getApplyButton() {
		return applyButton;
	}

	public static WebElement getPlaceButton() {
		return placeButton;
	}

	

}
