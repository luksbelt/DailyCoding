package com.lucas.test.ex69;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestProductCalculatorTest {
	
	private LargestProductCalculator underTest = new LargestProductCalculator();
	
	@Test
	public void test() {
		int[] arr = {-10, -10, 5, 2};
		assertEquals(500, underTest.calculateSingleloop(arr), 0);
		assertEquals(500, underTest.calculateWithSorting(arr), 0);
		
	}

}
