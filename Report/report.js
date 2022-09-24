$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Adactin.features");
formatter.feature({
  "line": 1,
  "name": "Checking the Hotel booking functionality of an Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch the Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"\u003cpassword\u003e\" In the Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And it Navigates to the Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "bala",
        "1995"
      ],
      "line": 13,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3"
    },
    {
      "cells": [
        "Balaji95",
        "12345678"
      ],
      "line": 14,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1805500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch the Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"abc\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"123\" In the Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And it Navigates to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_the_Url()"
});
formatter.result({
  "duration": 9139054400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 939753401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_the_Password_Field(String)"
});
formatter.result({
  "duration": 428154400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2090033399,
  "status": "passed"
});
formatter.after({
  "duration": 557700,
  "status": "passed"
});
formatter.before({
  "duration": 556300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch the Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"bala\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"1995\" In the Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And it Navigates to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_the_Url()"
});
formatter.result({
  "duration": 1254035800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bala",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 381490400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1995",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_the_Password_Field(String)"
});
formatter.result({
  "duration": 519827901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1436435400,
  "status": "passed"
});
formatter.after({
  "duration": 433900,
  "status": "passed"
});
formatter.before({
  "duration": 1416299,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch the Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"Balaji95\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"12345678\" In the Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And it Navigates to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_the_Url()"
});
formatter.result({
  "duration": 1190609800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Balaji95",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 314612601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_In_the_Password_Field(String)"
});
formatter.result({
  "duration": 170449900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3295511200,
  "status": "passed"
});
formatter.after({
  "duration": 374300,
  "status": "passed"
});
formatter.before({
  "duration": 352200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user Select The Location In the Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel In the Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The RoomType In the RoomType Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number of Rooms In the Number of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number of Adults Per Room In the Number of Adults Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Number of Children Per Room In the Number of Children Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click The Search Button To Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_the_Location_Field()"
});
formatter.result({
  "duration": 831149800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_the_Hotel_Field()"
});
formatter.result({
  "duration": 918665100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_RoomType_In_the_RoomType_Field()"
});
formatter.result({
  "duration": 528286200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_of_Rooms_In_the_Number_of_Rooms_Field()"
});
formatter.result({
  "duration": 643073201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_of_Adults_Per_Room_In_the_Number_of_Adults_Field()"
});
formatter.result({
  "duration": 787054300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_of_Children_Per_Room_In_the_Number_of_Children_Field()"
});
formatter.result({
  "duration": 540965900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_To_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1811476100,
  "status": "passed"
});
formatter.after({
  "duration": 350299,
  "status": "passed"
});
formatter.before({
  "duration": 382800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user Select The Hotel In The Hotel Selection Field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Click The Continue Button To Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_The_Hotel_Selection_Field()"
});
formatter.result({
  "duration": 799618601,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_To_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 2246669100,
  "status": "passed"
});
formatter.after({
  "duration": 354900,
  "status": "passed"
});
formatter.before({
  "duration": 142300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Book A Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user Enter The FirstName In the FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter The LastName In the LastName Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Billing Address In the Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The CreditCard Number In the CreditCard Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The CreditCard Type In the CreditCard Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The Month In the CreditCard Details Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Year In the CreditCard Details Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The CVV Number In the CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Click The Book Now Button To Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_FirstName_In_the_FirstName_Field()"
});
formatter.result({
  "duration": 419670800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_LastName_In_the_LastName_Field()"
});
formatter.result({
  "duration": 394983400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_In_the_Billing_Address_Field()"
});
formatter.result({
  "duration": 650416699,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CreditCard_Number_In_the_CreditCard_Number_Field()"
});
formatter.result({
  "duration": 368939500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_CreditCard_Type_In_the_CreditCard_Type_Field()"
});
formatter.result({
  "duration": 1022241601,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Month_In_the_CreditCard_Details_Field()"
});
formatter.result({
  "duration": 1291824201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Year_In_the_CreditCard_Details_Field()"
});
formatter.result({
  "duration": 1139519101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_CVV_Number_In_the_CVV_Number_Field()"
});
formatter.result({
  "duration": 489002100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_Button_To_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 438359700,
  "status": "passed"
});
formatter.after({
  "duration": 1164900,
  "status": "passed"
});
formatter.before({
  "duration": 303299,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Booking Confirmation Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;booking-confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "user Click The Logout Button To Navigate To The Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Logout_Button_To_Navigate_To_The_Login_Page()"
});
formatter.result({
  "duration": 9197353700,
  "status": "passed"
});
formatter.after({
  "duration": 425900,
  "status": "passed"
});
});