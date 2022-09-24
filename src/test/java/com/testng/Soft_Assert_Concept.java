package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	@Test
	public void demo() {
		
		String exp="Source";
		String act="Sourc";
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
		System.out.println("Verification Successful");
		
	}

}