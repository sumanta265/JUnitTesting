package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class maxTest {

	@Test
	void testFindMax() {
		int[] x =new int[5];//int[] x =new int[]{1,3,4,5,6,6}
		x[0]=1;
		x[1]=5;
		x[2]=8;
		x[3]=9;
		x[4]=10;
		System.out.println(max.findMax(x));
		assertEquals(10,max.findMax(x));
		
		assertEquals(-10,max.findMax(new int[] {-20,-40,-10,-30}));
		
	}
	
	@Test
	void testadd() {
		
		
		assertEquals(30,max.add(10,20));
		
	}
	@Test
	void testfactorial() {
		
		assertEquals(12,max.factorial(5));
	}
	
	

}
