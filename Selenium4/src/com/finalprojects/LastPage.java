package com.finalprojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LastPage {
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	public static WebElement countryData;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public static WebElement checkBox;
	
	@FindBy(xpath="//button[text()='Proceed']")
	public static WebElement proceedButton;

	public static WebElement getCountryData() {
		return countryData;
	}

	public static WebElement getCheckBox() {
		return checkBox;
	}

	public static WebElement getProceedButton() {
		return proceedButton;
	}
	
}