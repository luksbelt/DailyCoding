package com.lucas.test.ex43;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lucas.test.ex43.Stack;

public class StackTest {
	
	private Stack underTest = new Stack();
	
	@Test
	public void test() {
		underTest.push(2);
		underTest.push(5);
		assertEquals(5, underTest.max());
		underTest.push(6);
		underTest.push(7);
		assertEquals(7, underTest.max());
		underTest.pop();
		assertEquals(6, underTest.max());
	}

}
