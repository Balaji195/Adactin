package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void apple() {

		System.out.println("Apple");
	}
	
	@Ignore
	@Test
	public void orange() {
		
		System.out.println("Orange");
	}
	
	@Test
	public void guava() {
		
		System.out.println("Guava");
	}
	
	@Test(enabled = false)
	public void tomato() {
		 
		System.out.println("Tomato");
	}
	
	@Test
	public void carrot() {
		
		System.out.println("Carrot");
	}
	
}
