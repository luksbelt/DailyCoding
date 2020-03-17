package com.lucas.test.ex1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainingAdditionTest {

	ContainingAddition underTest = new ContainingAddition();
	
	@Test
	public void test() {
		int[] arr1 = {10, 15, 3, 7};
		assertTrue(underTest.calculate(arr1, 17));
	}

}
