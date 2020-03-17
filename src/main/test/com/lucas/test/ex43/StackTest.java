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
		underTest.push(4);
		assertEquals(5, underTest.max());
		underTest.push(6);
		underTest.push(7);
		assertEquals(7, underTest.max());
		assertEquals(7, underTest.pop().intValue());
		assertEquals(6, underTest.max());
		assertEquals(6, underTest.pop().intValue());
		assertEquals(5, underTest.max());
	}

}
