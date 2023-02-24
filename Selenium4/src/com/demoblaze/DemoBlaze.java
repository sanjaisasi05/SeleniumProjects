package com.demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoBlaze {

	@FindBy(xpath="//a[text()='Monitors']")
	public static WebElement monitotsPress;
	
	@FindBy(xpath="//a[text()='Apple monitor 24']")
	public static WebElement pressApple;
	
	@FindBy(xpath="//a[text()='ASUS Full HD']")
    public static WebElement pressAsus;
		
		
		

	}


