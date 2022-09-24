package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumCourse\\Maven_Practice\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}

	public String getUrl() throws IOException {
		
		String url = p.getProperty("url");
		
		return url;	
	}
	
	public String getUname() throws IOException {

		String uname = p.getProperty("uname");
		
		return uname;
	}
	
	public String getPass() {

		String pass = p.getProperty("pass");
		
		return pass;
	}
	
	public String getFname() {
		
		String fname = p.getProperty("fname");
		
		return fname;
	}
	
	public String getLname() {
		
		String lname = p.getProperty("lname");
		
		return lname;
	}
	
	public String getAddress() {
		
		String address = p.getProperty("address");
		
		return address;
	}
	
	public String getCcnum() {
		
		String ccnum = p.getProperty("ccnum");
		
		return ccnum;
	}
	
	public String getPin() {
		
		String pin = p.getProperty("pin");
	
		return pin;
	}

}

