package com.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NxtPgeDemoBlaze {
	
	@FindBy(xpath="//a[text()='Add to cart']")
    public static WebElement cartAsus;
 	
	@FindBy(xpath="//a[text()='Add to cart']")
    public static WebElement cartApple;
    
}
