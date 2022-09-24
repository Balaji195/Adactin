package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_Page {

	public WebDriver driver;
	
	//Single Dropdown
		// 			WebElement loc = driver.findElement(By.id("location"));
		// 			Select a = new Select(loc);

		@FindBy(id = "location")
		private WebElement loc;

		public WebElement getLoc() {
			return loc;
		}

		@FindBy(id = "hotels")
		private WebElement hotel;

		public WebElement getHotel() {
			return hotel;
		}

		@FindBy(id = "room_type")
		private WebElement roomtype;

		public WebElement getRoomtype() {
			return roomtype;
		}

		@FindBy(id = "room_nos")
		private WebElement room;

		public WebElement getRoom() {
			return room;
		}

		@FindBy(id = "adult_room")
		private WebElement adult;

		public WebElement getAdult() {
			return adult;
		}

		@FindBy(id = "child_room")
		private WebElement child;

		public WebElement getChild() {
			return child;
		}

		//	driver.findElement(By.name("Submit")).click();  
		@FindBy(name = "Submit")
		private WebElement Submit;

		public WebElement getSubmit() {
			return Submit;
		}
		
		public Details_Page(WebDriver driver2) {

			this.driver = driver2;
			PageFactory.initElements(driver, this);
			}

}
