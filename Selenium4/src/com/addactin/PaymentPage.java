package com.addactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	
	@FindBy(id="first_name")
	public static WebElement firstName;
	
	@FindBy(id="last_name")
	public static WebElement lastName;
	
	@FindBy(id="address")
	public static WebElement billingAddress;
	
	@FindBy(id="cc_num")
	public static WebElement creditCard;
	
	@FindBy(id="cc_type")
	public static WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	public static WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	public static WebElement expYear;
	
	@FindBy(id="cc_cvv")
	public static WebElement cvvNumber;
	
	@FindBy(id="book_now")
	public static WebElement bookNow;
	
	@FindBy(id="my_itinerary")
	public static WebElement myLast;

	@FindBy(xpath="//input[@id='logout']")
	public static WebElement logOut;
}
