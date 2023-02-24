package com.addactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelNextpage {
	
	@FindBy(id="location")
	public static WebElement locate;
	
	@FindBy(className="search_combobox")
	public static WebElement hotelsname;
	
	@FindBy(id="room_type")
	public static WebElement typeRooms;
	
	@FindBy(id="room_nos")
	public static WebElement howManyRooms;
	
	@FindBy(className="date_pick")
	public static WebElement checkIn;
	
	@FindBy(id="datepick_out")
	public static WebElement checkOut;
	
	@FindBy(className="search_combobox")
	public static WebElement adultRoom;
	
	@FindBy(id="child_room")
	public static WebElement childRoom;
	
	@FindBy(id="Submit")
	public static WebElement searchButton;

	public static WebElement getLocate() {
		return locate;
	}

	public static WebElement getHotelsname() {
		return hotelsname;
	}

	public static WebElement getTypeRooms() {
		return typeRooms;
	}

	public static WebElement getHowManyRooms() {
		return howManyRooms;
	}

	public static WebElement getCheckIn() {
		return checkIn;
	}

	public static WebElement getCheckOut() {
		return checkOut;
	}

	public static WebElement getAdultRoom() {
		return adultRoom;
	}

	public static WebElement getChildRoom() {
		return childRoom;
	}

	public static WebElement getSearchButton() {
		return searchButton;
	}



}
