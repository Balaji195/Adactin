package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Fruits")
	public void apple() {

		
		System.out.println("Apple");
	}
	
	@Test(groups = "Fruits")
	public void orange() {
		
		System.out.println("Orange");
	}
	
	@Test(groups = "Fruits")
	public void guava() {
		
		System.out.println("Guava");
	}
	
	@Test(groups = "Vegetables")
	public void tomato() {
		 
		System.out.println("Tomato");
	}
	
	@Test(groups = "Vegetables")
	public void carrot() {
		
		System.out.println("Carrot");
	}
	
	@Test(groups = "Nonveg")
	public void chicken() {
		
		System.out.println("Chicken");
	}
	
	@Test(groups = "Nonveg")
	public void mutton() {
		
		System.out.println("Mutton");
	}
}

