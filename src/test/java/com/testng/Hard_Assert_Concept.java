package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

	@Test
	public void demo() {
		
		String exp= "Source";
		String act= "Source";
		
		//If exp or act Contains null Value, then Test is Passed
//		Assert.assertNull(exp,act);                                
//		System.out.println("Validation Successful");
		
		Assert.assertNull(exp,act);                                
		System.out.println("Validation Successful");
		
		Assert.assertEquals(act, exp);
		System.out.println("Validation Successful");
		
		Assert.assertSame(act, exp);
		System.out.println("Validation Successful");
		
		//If exp or act are Not Equal, then Test is Passed
//		Assert.assertNotEquals(act, exp);
//		System.out.println("Validation Successful");
	}
}
