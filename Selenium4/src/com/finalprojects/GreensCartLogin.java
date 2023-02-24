package com.finalprojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GreensCartLogin {
	
	@FindBy(xpath="//input[@type='search']")
	public static WebElement searchBar;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]")
	public static WebElement addToCart;
	
	@FindBy(className="cart-icon")
	public static WebElement cartIcon;
	
	@FindBy(className="action-block")
	public static WebElement proceedToCheck;

	public static WebElement getSearchBar() {
		return searchBar;
	}

	public static WebElement getAddToCart() {
		return addToCart;
	}

	public static WebElement getCartIcon() {
		return cartIcon;
	}

	public static WebElement getProceedToCheck() {
		return proceedToCheck;
	}


}
