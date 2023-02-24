package com.addactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelLogin {
	
	@FindBy(className="login_input")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement passWord;
	
	@FindBy(className="login_button")
	public static WebElement loginButton;

	public static WebElement getUserName() {
		return userName;
	}

	public static WebElement getPassWord() {
		return passWord;
	}

	public static WebElement getLoginButton() {
		return loginButton;
	}

}
