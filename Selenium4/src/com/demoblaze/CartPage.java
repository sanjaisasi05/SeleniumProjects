package com.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath="//a[@id='cartur']")
    public static WebElement cartIcon;
    
    @FindBy(xpath="//button[text()='Place Order']")
    public static WebElement placeOrder;
}
