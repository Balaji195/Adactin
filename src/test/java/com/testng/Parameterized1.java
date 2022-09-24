package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized1 {
	
	@Test
	@Parameters({"username","password"})
	public void Security(@Optional("Balaji@95")String username, @Optional("Pass@95")String password) {
		
		System.out.println("Secure Username is: "+username);
		
		System.out.println("Secure Password is: "+password);

	}

}