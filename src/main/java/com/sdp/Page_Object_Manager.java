package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Booking_Confirm;
import com.pom.Details_Page;
import com.pom.LoginClass;
import com.pom.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;  //Null

	//private classname object;

	private LoginClass lp;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public LoginClass getInstanceLogin(){

		if (lp==null) {

			lp = new LoginClass(driver);
		}

		return lp;
	}

	// Detail Page
	private Details_Page dp;

	public Details_Page getInstanceDetails() {

		if (dp == null) {

			dp = new Details_Page(driver);

		}

		return dp;
	}

	//Select Hotel
	private Select_Hotel sh;
	
	public Select_Hotel getInstanceSelect() {
		
		if (sh==null) {
			
			sh =new Select_Hotel(driver);
			
		}
		
		return sh;
	}

    //Book Hotel
	private Book_Hotel bh;
	
	public Book_Hotel getInstanceBookHotel() {
		
		if (bh==null) {
			
			bh = new Book_Hotel(driver);
			
		}
		return bh;
	}

    //Booking Confirmation
	private Booking_Confirm bc;
	
	public Booking_Confirm getInstanceConfirm() {
		
		if (bc==null) {
			
			bc = new Booking_Confirm(driver);
			
		}
		
		return bc;
	}
}
