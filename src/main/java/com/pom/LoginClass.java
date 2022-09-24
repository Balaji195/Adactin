package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement uname;

	public WebElement getUname() {
		return uname;
	}

	@FindBy(name = "password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public LoginClass(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
