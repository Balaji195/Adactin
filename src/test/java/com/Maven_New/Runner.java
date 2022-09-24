package com.Maven_New;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Runner extends Base_Class {
	
	public static WebDriver driver = launchBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {
 
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		
		//Login Page

		String uname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUname();
		passValues(pom.getInstanceLogin().getUname(), uname);

		String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPass();
		passValues(pom.getInstanceLogin().getPass(), pass);

		clickOnElement(pom.getInstanceLogin().getLogin());
		
		//Details Page
		
		dropDown(pom.getInstanceDetails().getLoc(), "index", "2");

		dropDown(pom.getInstanceDetails().getHotel(), "index", "2");

		dropDown(pom.getInstanceDetails().getRoomtype(), "visibletext", "Double");

		dropDown(pom.getInstanceDetails().getRoom(), "index", "2");

        dropDown(pom.getInstanceDetails().getAdult(), "value", "2");
       
        dropDown(pom.getInstanceDetails().getChild(), "visibletext", "0 - None");
        
        clickOnElement(pom.getInstanceDetails().getSubmit());
         
        //Select Hotel
        
        clickOnElement(pom.getInstanceSelect().getRadio());
        
        clickOnElement(pom.getInstanceSelect().getClickcontinue());
        
        //Book Hotel
        
        String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFname();
        passValues(pom.getInstanceBookHotel().getFname(), fname);
        
        String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLname();
        passValues(pom.getInstanceBookHotel().getLname(), lname);
        
        String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
        passValues(pom.getInstanceBookHotel().getAddress(), address);
        
        String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();
        passValues(pom.getInstanceBookHotel().getCcnum(), ccnum);
        
        dropDown(pom.getInstanceBookHotel().getCardtype(), "Index", "2");

        dropDown(pom.getInstanceBookHotel().getMonth(), "index", "2");

        dropDown(pom.getInstanceBookHotel().getYear(), "visibletext", "2022");

        String pin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPin();
        passValues(pom.getInstanceBookHotel().getPin(), pin);

        clickOnElement(pom.getInstanceBookHotel().getBook());
        
        Thread.sleep(7000);
        
        //Booking Confirmation 
        
        screenShot("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_New\\Screenshot\\pic1.png");
	
        clickOnElement(pom.getInstanceConfirm().getLogout());

        closeTab();
	}

}

















