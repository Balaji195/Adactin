package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void setProperty() {
		
		System.out.println("Set Property");
	}
	
	@BeforeTest
	public void browserLaunch() {

		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	public void urlLaunch() {

		
		System.out.println("Url Launch");
	}
	
	@BeforeMethod
	public void signin() {

		System.out.println("Siginin");
	}
	
	@Test(priority = 0)
	public void women() {
		
		System.out.println("Women");
	}
	
	@Test(priority = 2)
	public void men() {
		
		System.out.println("Men");
	}
	
	@Test(invocationCount = 2)
	public void Kids() {
		
		System.out.println("Kids");
	}
	
	@AfterMethod
	public void signout() {
		
		System.out.println("Signout");
	}
	
	@AfterClass
	public void screenshot() {
		
		System.out.println("Screenshot");
	}
	
	@AfterTest
	public void closeBrowser() {
	
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void quitBrowser() {
		
		System.out.println("Quit Browser");
	}
	
}
