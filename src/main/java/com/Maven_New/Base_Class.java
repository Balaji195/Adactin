package com.Maven_New;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
public static WebDriver driver; //null
	
	// Browser Launch
	public static WebDriver launchBrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\"
					+ "SeleniumPractice\\Drivers\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	
		}
        
		return driver;
		
	}
          
	//get
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	//close
	public static void closeTab() {
		
		driver.close();
	}
	
	//Quit
	public static void quitBrowser() {

		driver.quit();
	}
	
	//Sendkeys
	public static void passValues(WebElement element, String input) {

		element.sendKeys(input);
	}
	
	//click
	public static void clickOnElement(WebElement element) {

		element.click();
	}
	
	//Navigate to()
	public static void navigateTo(String url1) {
		
      driver.navigate().to(url1);
	}
	
	//Navigate back()
	public static void navigateBack() {
 
		driver.navigate().back();
	}
	
	//Navigate forward()
	public static void navigateForward() {

		driver.navigate().forward();
	}
	
	//Navigate refresh()
	public static void navigateRefresh() {

		driver.navigate().refresh();
	}
	
	
	//get Title()
	public static void getTitle() {

		driver.getTitle();
	}
	
	//TakesScreenshot
	public static void screenShot(String location) throws IOException {

        TakesScreenshot shot = (TakesScreenshot) driver;
		
		File source = shot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(location);
		
		FileUtils.copyFile(source, destination); 
	}
	
	//DropDown
	public static void dropDown(WebElement element, String type, String input) {

		Select d = new Select(element);
		
		if (type.equalsIgnoreCase("visibletext")) {
			d.selectByVisibleText(input);
		}
		else if (type.equalsIgnoreCase("value")) {
			d.selectByValue(input);
		}
		else if (type.equalsIgnoreCase("index")) {
			int indexinput = Integer.parseInt(input);
			d.selectByIndex(indexinput);
		}
	}
	
	
}

