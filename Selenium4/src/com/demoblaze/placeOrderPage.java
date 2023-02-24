package com.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class placeOrderPage {
	
		@FindBy(xpath="//input[@id='name']")
	    public static WebElement userName;
	    
	    @FindBy(xpath="//input[@id='country']")
	    public static WebElement countryName;
	    
	    @FindBy(xpath="//input[@id='city']")
	    public static WebElement cityName;
	    
	    @FindBy(xpath="//input[@id='card']")
	    public static WebElement creditCard;
	    
	    @FindBy(xpath="//input[@id='month']")
	    public static WebElement cardMonth;
	    
	    @FindBy(xpath="//input[@id='year']")
	    public static WebElement cardYear;
	    
	    @FindBy(xpath="//button[text()='Purchase']")
	    public static WebElement purchaseButton; 
	    
	    @FindBy(xpath="//button[text()='OK']")
	    public static WebElement okButton;
}
