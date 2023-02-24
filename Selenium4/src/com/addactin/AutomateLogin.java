package com.addactin;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.Day2.BaseClass;
public class AutomateLogin extends BaseClass {

	public static void main(String[] args) {
		
		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, HotelLogin.class);
		
		HotelLogin.userName.sendKeys("sanjaisasi");
		HotelLogin.passWord.sendKeys("rohithsurya07");
		HotelLogin.loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, HotelNextpage.class);
		HotelNextpage.locate.sendKeys("London");
		HotelNextpage.locate.click();
		HotelNextpage.hotelsname.sendKeys("Hotel Creek");
		HotelNextpage.hotelsname.click();
		HotelNextpage.typeRooms.sendKeys("Double");
		HotelNextpage.typeRooms.click();
		HotelNextpage.howManyRooms.sendKeys("One");
		HotelNextpage.howManyRooms.click();
		HotelNextpage.checkIn.sendKeys("03/01/2023");
		HotelNextpage.checkIn.click();
		HotelNextpage.checkOut.sendKeys("04/01/2023");
		HotelNextpage.checkOut.click();
		HotelNextpage.adultRoom.sendKeys("2 - Two");
		HotelNextpage.adultRoom.click();
		HotelNextpage.childRoom.sendKeys("2 - Two");
		HotelNextpage.childRoom.click();
		HotelNextpage.searchButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, AddactinNextpage.class);
		AddactinNextpage.checkBox.click();
		AddactinNextpage.continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, PaymentPage.class);
		PaymentPage.firstName.sendKeys("Sanjai");
		PaymentPage.firstName.click();
		PaymentPage.lastName.sendKeys("Captain");
		PaymentPage.lastName.click();
		PaymentPage.billingAddress.sendKeys("135 Madurai Last Street Dubai-15");
		PaymentPage.billingAddress.click();
		PaymentPage.creditCard.sendKeys("5458 3282 1968 7788");
		PaymentPage.creditCard.click();
		PaymentPage.creditCardType.sendKeys("American Express");
		PaymentPage.creditCard.click();
		PaymentPage.expMonth.sendKeys("May");
		PaymentPage.expMonth.click();
		PaymentPage.expYear.sendKeys("2022");
		PaymentPage.expYear.click();
		PaymentPage.cvvNumber.sendKeys("231");
		PaymentPage.cvvNumber.click();
		PaymentPage.bookNow.click();
		PaymentPage.myLast.click();
		scrollByTopToBottomPixels();
		PaymentPage.logOut.click();
	}

	
}
