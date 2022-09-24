 package com.stepdefinition;

import java.io.IOException;

import com.Maven_New.Base_Class;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class{
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
 
		String name = s.getName();
		System.out.println("Scenario Name:" +name);
	}
	
	@After
	public void afterHooks(Scenario s) throws IOException {

		String status = s.getStatus();
		System.out.println("Scenario status:" +status);
		if (s.isFailed()) {
			
			screenShot("");
		}
	}

	//Login Page
	@Given("^user Must Launch the Url$")
	public void user_Must_Launch_the_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	}
	
	@When("^user Enter the \"([^\"]*)\" In The Username Field$")
	public void user_Enter_the_In_The_Username_Field(String username) throws Throwable {

		passValues(pom.getInstanceLogin().getUname(), username);
	}

	@When("^user Enter the \"([^\"]*)\" In the Password Field$")
	public void user_Enter_the_In_the_Password_Field(String password) throws Throwable {

		passValues(pom.getInstanceLogin().getPass(), password);
	}

	@Then("^user Click The Login Button And it Navigates to the Search Hotel Page$")
	public void user_Click_The_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLogin());
	}
	
	//Details Page
	
	@When("^user Select The Location In the Location Field$")
	public void user_Select_The_Location_In_the_Location_Field() throws Throwable {

		dropDown(pom.getInstanceDetails().getLoc(), "index", "2");

	}

	@When("^user Select The Hotel In the Hotel Field$")
	public void user_Select_The_Hotel_In_the_Hotel_Field() throws Throwable {

		dropDown(pom.getInstanceDetails().getHotel(), "index", "2");
	}

	@When("^user Select The RoomType In the RoomType Field$")
	public void user_Select_The_RoomType_In_the_RoomType_Field() throws Throwable {

		dropDown(pom.getInstanceDetails().getRoomtype(), "visibletext", "Double");
	
	}

	@When("^user Select The Number of Rooms In the Number of Rooms Field$")
	public void user_Select_The_Number_of_Rooms_In_the_Number_of_Rooms_Field() throws Throwable {

		dropDown(pom.getInstanceDetails().getRoom(), "index", "2");

	}

	@When("^user Select The Number of Adults Per Room In the Number of Adults Field$")
	public void user_Select_The_Number_of_Adults_Per_Room_In_the_Number_of_Adults_Field() throws Throwable {

        dropDown(pom.getInstanceDetails().getAdult(), "value", "2");
       
	}

	@When("^user Select The Number of Children Per Room In the Number of Children Field$")
	public void user_Select_The_Number_of_Children_Per_Room_In_the_Number_of_Children_Field() throws Throwable {

        dropDown(pom.getInstanceDetails().getChild(), "visibletext", "0 - None");
        
	}

	@Then("^user Click The Search Button To Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_To_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		 clickOnElement(pom.getInstanceDetails().getSubmit());

	}

	//Select Hotel
	
	@When("^user Select The Hotel In The Hotel Selection Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Selection_Field() throws Throwable {

		  clickOnElement(pom.getInstanceSelect().getRadio());
	        
	}

	@Then("^user Click The Continue Button To Navigates To The Book Hotel Page$")
	public void user_Click_The_Continue_Button_To_Navigates_To_The_Book_Hotel_Page() throws Throwable {
	        
	        clickOnElement(pom.getInstanceSelect().getClickcontinue());
	
	}

	//Book Hotel
	
	@When("^user Enter The FirstName In the FirstName Field$")
	public void user_Enter_The_FirstName_In_the_FirstName_Field() throws Throwable {
		
		String fname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFname();
        passValues(pom.getInstanceBookHotel().getFname(), fname);
        	
	}

	@When("^user Enter The LastName In the LastName Field$")
	public void user_Enter_The_LastName_In_the_LastName_Field() throws Throwable {
        
        String lname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLname();
        passValues(pom.getInstanceBookHotel().getLname(), lname);
        
	}

	@When("^user Enter The Billing Address In the Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_the_Billing_Address_Field() throws Throwable {
        
        String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
        passValues(pom.getInstanceBookHotel().getAddress(), address);
        
	}

	@When("^user Enter The CreditCard Number In the CreditCard Number Field$")
	public void user_Enter_The_CreditCard_Number_In_the_CreditCard_Number_Field() throws Throwable {
		
        String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();
        passValues(pom.getInstanceBookHotel().getCcnum(), ccnum);
	
	}

	@When("^user Select The CreditCard Type In the CreditCard Type Field$")
	public void user_Select_The_CreditCard_Type_In_the_CreditCard_Type_Field() throws Throwable {

		dropDown(pom.getInstanceBookHotel().getCardtype(), "Index", "2");
	
	}

	@When("^user Select The Month In the CreditCard Details Field$")
	public void user_Select_The_Month_In_the_CreditCard_Details_Field() throws Throwable {

		dropDown(pom.getInstanceBookHotel().getMonth(), "index", "2");

	}

	@When("^user Select The Year In the CreditCard Details Field$")
	public void user_Select_The_Year_In_the_CreditCard_Details_Field() throws Throwable {

		dropDown(pom.getInstanceBookHotel().getYear(), "visibletext", "2022");

	}

	@When("^user Enter The CVV Number In the CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_the_CVV_Number_Field() throws Throwable {
		
		String pin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPin();
        passValues(pom.getInstanceBookHotel().getPin(), pin);

	}

	@Then("^user Click The Book Now Button To Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_To_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {

		clickOnElement(pom.getInstanceBookHotel().getBook());
	}
	
	//Booking Confirmation
	@Then("^user Click The Logout Button To Navigate To The Login Page$")
	public void user_Click_The_Logout_Button_To_Navigate_To_The_Login_Page() throws Throwable {

		Thread.sleep(7000);
		
		clickOnElement(pom.getInstanceConfirm().getLogout());

	}

}

