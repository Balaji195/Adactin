package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void username() {

		String exp = "Source";
		String act = "Source";
		Assert.assertEquals(act, exp);
	}
	
	@Test
	public void password() {
		
		String exp = "User@123";
		String act = "user@123";
		Assert.assertEquals(act, exp);
	}
}

