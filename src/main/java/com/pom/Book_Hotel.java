package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}

	@FindBy(id = "last_name")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
	}

	@FindBy(id ="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	public WebElement getCcnum() {
		return ccnum;
	}

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}

	@FindBy(id = "cc_cvv")
	private WebElement pin;

	public WebElement getPin() {
		return pin;
	}

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}

	public Book_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}

